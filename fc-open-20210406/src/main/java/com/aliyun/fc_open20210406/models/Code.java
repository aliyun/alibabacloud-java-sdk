// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Code extends TeaModel {
    // 函数代码包的OSS bucket name
    @NameInMap("ossBucketName")
    public String ossBucketName;

    // 函数代码包的OSS对象名
    @NameInMap("ossObjectName")
    public String ossObjectName;

    // 直接在request body中上传code zip包的base64编码
    @NameInMap("zipFile")
    public String zipFile;

    public static Code build(java.util.Map<String, ?> map) throws Exception {
        Code self = new Code();
        return TeaModel.build(map, self);
    }

    public Code setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public Code setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public Code setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
