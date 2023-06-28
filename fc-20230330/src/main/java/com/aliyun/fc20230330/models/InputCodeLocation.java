// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InputCodeLocation extends TeaModel {
    @NameInMap("checksum")
    public String checksum;

    @NameInMap("ossBucketName")
    public String ossBucketName;

    @NameInMap("ossObjectName")
    public String ossObjectName;

    @NameInMap("zipFile")
    public String zipFile;

    public static InputCodeLocation build(java.util.Map<String, ?> map) throws Exception {
        InputCodeLocation self = new InputCodeLocation();
        return TeaModel.build(map, self);
    }

    public InputCodeLocation setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public InputCodeLocation setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public InputCodeLocation setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public InputCodeLocation setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
