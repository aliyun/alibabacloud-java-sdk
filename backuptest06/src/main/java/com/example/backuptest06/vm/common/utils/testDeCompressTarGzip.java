package com.example.backuptest06.vm.common.utils;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author
 * @Description
 * @time 2022111816:56
 */
public class testDeCompressTarGzip {

    public  void test() throws IOException {
        //解压文件
        Path source = Paths.get("D:\\Graduate's\\HuaWei_balabala\\m-2.raw.tar.gz");
        //解压到哪
        Path target = Paths.get("D:\\Graduate's\\HuaWei_balabala\\tar_gz_test");

        if (Files.notExists(source)) {
            throw new IOException("您要解压的文件不存在");
        }

        //InputStream输入流，以下四个流将tar.gz读取到内存并操作
        //BufferedInputStream缓冲输入流
        //GzipCompressorInputStream解压输入流
        //TarArchiveInputStream解tar包输入流
        try (InputStream fi = Files.newInputStream(source);
             BufferedInputStream bi = new BufferedInputStream(fi);
             GzipCompressorInputStream gzi = new GzipCompressorInputStream(bi);
             TarArchiveInputStream ti = new TarArchiveInputStream(gzi)) {

            ArchiveEntry entry;
            while ((entry = ti.getNextEntry()) != null) {
                //获取解压文件目录，并判断文件是否损坏
                Path newPath = zipSlipProtect(entry, target);

                if (entry.isDirectory()) {
                    //创建解压文件目录
                    Files.createDirectories(newPath);
                } else {
                    //再次校验解压文件目录是否存在
                    Path parent = newPath.getParent();
                    if (parent != null) {
                        if (Files.notExists(parent)) {
                            Files.createDirectories(parent);
                        }
                    }
                    // 将解压文件输入到TarArchiveInputStream，输出到磁盘newPath目录
                    Files.copy(ti, newPath, StandardCopyOption.REPLACE_EXISTING);

                }
            }
        }

    }

    //判断压缩文件是否被损坏，并返回该文件的解压目录
    private  Path zipSlipProtect(ArchiveEntry entry, Path targetDir)
            throws IOException {

        Path targetDirResolved = targetDir.resolve(entry.getName());
        Path normalizePath = targetDirResolved.normalize();

        if (!normalizePath.startsWith(targetDir)) {
            throw new IOException("压缩文件已被损坏: " + entry.getName());
        }

        return normalizePath;
    }
    public  void decompressTarGz(File sourceTarGzFile, File targetDir) throws IOException {
        // decompressing *.tar.gz files to tar
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new GzipCompressorInputStream(Files.newInputStream(sourceTarGzFile.toPath())));
        TarArchiveEntry entry;
        // 将 tar 文件解压到 targetDir 目录下
        // 将 tar.gz文件解压成tar包,然后读取tar包里的文件元组，复制文件到指定目录
        while ((entry = tarArchiveInputStream.getNextTarEntry()) != null) {
            if (entry.isDirectory()) {
                continue;
            }
            File targetFile = new File(targetDir, entry.getName());
            File parent = targetFile.getParentFile();
            if (!parent.exists()) {
                parent.mkdirs();
            }
            // 将文件写出到解压的目录
            IOUtils.copy(tarArchiveInputStream, Files.newOutputStream(targetFile.toPath()));
        }
    }

}
