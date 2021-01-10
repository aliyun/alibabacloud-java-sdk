// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssUploadMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssUploadMeta")
    public GenerateOssUploadMetaResponseBodyOssUploadMeta ossUploadMeta;

    public static GenerateOssUploadMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUploadMetaResponseBody self = new GenerateOssUploadMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOssUploadMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOssUploadMetaResponseBody setOssUploadMeta(GenerateOssUploadMetaResponseBodyOssUploadMeta ossUploadMeta) {
        this.ossUploadMeta = ossUploadMeta;
        return this;
    }
    public GenerateOssUploadMetaResponseBodyOssUploadMeta getOssUploadMeta() {
        return this.ossUploadMeta;
    }

    public static class GenerateOssUploadMetaResponseBodyOssUploadMeta extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Bucket")
        public String bucket;

        public static GenerateOssUploadMetaResponseBodyOssUploadMeta build(java.util.Map<String, ?> map) throws Exception {
            GenerateOssUploadMetaResponseBodyOssUploadMeta self = new GenerateOssUploadMetaResponseBodyOssUploadMeta();
            return TeaModel.build(map, self);
        }

        public GenerateOssUploadMetaResponseBodyOssUploadMeta setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GenerateOssUploadMetaResponseBodyOssUploadMeta setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GenerateOssUploadMetaResponseBodyOssUploadMeta setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GenerateOssUploadMetaResponseBodyOssUploadMeta setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateOssUploadMetaResponseBodyOssUploadMeta setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

}
