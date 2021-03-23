// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateFunctionFileUploadMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadMeta")
    public GenerateFunctionFileUploadMetaResponseBodyUploadMeta uploadMeta;

    public static GenerateFunctionFileUploadMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateFunctionFileUploadMetaResponseBody self = new GenerateFunctionFileUploadMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateFunctionFileUploadMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateFunctionFileUploadMetaResponseBody setUploadMeta(GenerateFunctionFileUploadMetaResponseBodyUploadMeta uploadMeta) {
        this.uploadMeta = uploadMeta;
        return this;
    }
    public GenerateFunctionFileUploadMetaResponseBodyUploadMeta getUploadMeta() {
        return this.uploadMeta;
    }

    public static class GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Host")
        public String host;

        public static GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy self = new GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy();
            return TeaModel.build(map, self);
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class GenerateFunctionFileUploadMetaResponseBodyUploadMeta extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("PostObjectPolicy")
        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy postObjectPolicy;

        public static GenerateFunctionFileUploadMetaResponseBodyUploadMeta build(java.util.Map<String, ?> map) throws Exception {
            GenerateFunctionFileUploadMetaResponseBodyUploadMeta self = new GenerateFunctionFileUploadMetaResponseBodyUploadMeta();
            return TeaModel.build(map, self);
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMeta setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMeta setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GenerateFunctionFileUploadMetaResponseBodyUploadMeta setPostObjectPolicy(GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy postObjectPolicy) {
            this.postObjectPolicy = postObjectPolicy;
            return this;
        }
        public GenerateFunctionFileUploadMetaResponseBodyUploadMetaPostObjectPolicy getPostObjectPolicy() {
            return this.postObjectPolicy;
        }

    }

}
