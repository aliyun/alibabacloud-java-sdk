package com.example.backuptest06.vm.common.api.ecs;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.GetObjectRequest;
import com.example.backuptest06.vm.common.config.AliyunOssClientConfig;

import java.io.File;

/**
 * @author
 * @Description
 * @time 202209300:19
 */
public class DownloadImage {
        public  void startDownload (String imageName){

            // 填写Bucket名称，例如examplebucket。
            String bucketName = "ecs-backup-recovery";
            // 填写不包含Bucket名称在内的Object完整路径，例如testfolder/exampleobject.txt。
//            String objectName = "backup_m-2ze2gu2si5vs2n8en5mk_system.raw.tar.gz";
            String objectName =imageName;
            String pathName = "D:\\Graduate's\\HuaWei_balabala\\"+imageName;
//            // 创建OSSClient实例。
            OSS ossClient = AliyunOssClientConfig.createClient();
            try {
                // 下载Object到本地文件，并保存到指定的本地路径中。如果指定的本地文件存在会覆盖，不存在则新建。
                // 如果未指定本地路径，则下载后的文件默认保存到示例程序所属项目对应本地路径中。
                ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File(pathName));
            } catch (OSSException oe) {
                System.out.println("Caught an OSSException, which means your request made it to OSS, "
                        + "but was rejected with an error response for some reason.");
                System.out.println("Error Message:" + oe.getErrorMessage());
                System.out.println("Error Code:" + oe.getErrorCode());
                System.out.println("Request ID:" + oe.getRequestId());
                System.out.println("Host ID:" + oe.getHostId());
            } catch (ClientException ce) {
                System.out.println("Caught an ClientException, which means the client encountered "
                        + "a serious internal problem while trying to communicate with OSS, "
                        + "such as not being able to access the network.");
                System.out.println("Error Message:" + ce.getMessage());
            } finally {
                if (ossClient != null) {
                    ossClient.shutdown();
                }
            }
        }
    }
