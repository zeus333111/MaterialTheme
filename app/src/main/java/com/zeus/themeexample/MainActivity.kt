package com.zeus.themeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        normal.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Titulo de un Material Dialog")
                .setMessage("Este es un dialogo parte de los componentes de material design, usando el tema global de la aplicacion")
                .setPositiveButton("Ok"){_,_ ->}
                .setNegativeButton("Cancelar"){_,_->}
                .show()
        }

        borderless.setOnClickListener {
            Snackbar.make(it,"Snackbar a un boton",Snackbar.LENGTH_LONG)
                .setAction("Ok"){}
                .show()
        }

        colored.setOnClickListener {
            
        }
    }
}
