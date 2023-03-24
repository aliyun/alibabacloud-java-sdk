package com.example.backuptest06.vm.common.config;
import com.qcloud.cos.*;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.region.Region;

/**
 * @author
 * @Description
 * @time 2022093017:20
 */
public class TencentCloudCosClientConfig {
    public static COSClient createClient(){
        // 初始化用户身份信息（secretId, secretKey）。
        String secretId = "SECRETID";
        String secretKey = "SECRETKEY";
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        Region region = new Region("COS_REGION");
        ClientConfig clientConfig = new ClientConfig(region);
        clientConfig.setHttpProtocol(HttpProtocol.https);
        // 生成 cos 客户端。
        COSClient cosClient = new COSClient(cred, clientConfig);
        return cosClient;
    }

}
