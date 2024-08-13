// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class OssUploadCredential extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("OssPolicy")
    public String ossPolicy;

    @NameInMap("OssSignature")
    public String ossSignature;

    @NameInMap("StsToken")
    public String stsToken;

    public static OssUploadCredential build(java.util.Map<String, ?> map) throws Exception {
        OssUploadCredential self = new OssUploadCredential();
        return TeaModel.build(map, self);
    }

    public OssUploadCredential setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public OssUploadCredential setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OssUploadCredential setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public OssUploadCredential setOssPolicy(String ossPolicy) {
        this.ossPolicy = ossPolicy;
        return this;
    }
    public String getOssPolicy() {
        return this.ossPolicy;
    }

    public OssUploadCredential setOssSignature(String ossSignature) {
        this.ossSignature = ossSignature;
        return this;
    }
    public String getOssSignature() {
        return this.ossSignature;
    }

    public OssUploadCredential setStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }
    public String getStsToken() {
        return this.stsToken;
    }

}
