// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetOssUploadMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssUploadMeta")
    public GetOssUploadMetaResponseBodyOssUploadMeta ossUploadMeta;

    public static GetOssUploadMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadMetaResponseBody self = new GetOssUploadMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUploadMetaResponseBody setOssUploadMeta(GetOssUploadMetaResponseBodyOssUploadMeta ossUploadMeta) {
        this.ossUploadMeta = ossUploadMeta;
        return this;
    }
    public GetOssUploadMetaResponseBodyOssUploadMeta getOssUploadMeta() {
        return this.ossUploadMeta;
    }

    public static class GetOssUploadMetaResponseBodyOssUploadMeta extends TeaModel {
        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("Host")
        public String host;

        public static GetOssUploadMetaResponseBodyOssUploadMeta build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadMetaResponseBodyOssUploadMeta self = new GetOssUploadMetaResponseBodyOssUploadMeta();
            return TeaModel.build(map, self);
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetOssUploadMetaResponseBodyOssUploadMeta setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

}
