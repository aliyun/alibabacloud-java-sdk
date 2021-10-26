// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Code extends TeaModel {
    // codeCheckSum
    @NameInMap("codeCheckSum")
    public String codeCheckSum;

    // error
    @NameInMap("err")
    public String err;

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

    public Code setCodeCheckSum(String codeCheckSum) {
        this.codeCheckSum = codeCheckSum;
        return this;
    }
    public String getCodeCheckSum() {
        return this.codeCheckSum;
    }

    public Code setErr(String err) {
        this.err = err;
        return this;
    }
    public String getErr() {
        return this.err;
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
