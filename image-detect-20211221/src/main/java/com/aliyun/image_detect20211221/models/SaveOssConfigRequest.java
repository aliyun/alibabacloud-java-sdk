// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class SaveOssConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("OssAccessKeyId")
    public String ossAccessKeyId;

    @NameInMap("OssAccessKeySecret")
    public String ossAccessKeySecret;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    public static SaveOssConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOssConfigRequest self = new SaveOssConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveOssConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public SaveOssConfigRequest setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public SaveOssConfigRequest setOssAccessKeySecret(String ossAccessKeySecret) {
        this.ossAccessKeySecret = ossAccessKeySecret;
        return this;
    }
    public String getOssAccessKeySecret() {
        return this.ossAccessKeySecret;
    }

    public SaveOssConfigRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public SaveOssConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}
