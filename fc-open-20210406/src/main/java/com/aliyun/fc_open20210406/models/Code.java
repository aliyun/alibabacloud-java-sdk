// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Code extends TeaModel {
    @NameInMap("ossBucketName")
    public String ossBucketName;

    @NameInMap("ossObjectName")
    public String ossObjectName;

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
