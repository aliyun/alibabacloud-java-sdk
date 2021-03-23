// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssPostPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssPostPolicy")
    public GenerateOssPostPolicyResponseBodyOssPostPolicy ossPostPolicy;

    public static GenerateOssPostPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssPostPolicyResponseBody self = new GenerateOssPostPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOssPostPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOssPostPolicyResponseBody setOssPostPolicy(GenerateOssPostPolicyResponseBodyOssPostPolicy ossPostPolicy) {
        this.ossPostPolicy = ossPostPolicy;
        return this;
    }
    public GenerateOssPostPolicyResponseBodyOssPostPolicy getOssPostPolicy() {
        return this.ossPostPolicy;
    }

    public static class GenerateOssPostPolicyResponseBodyOssPostPolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Host")
        public String host;

        @NameInMap("Expire")
        public String expire;

        public static GenerateOssPostPolicyResponseBodyOssPostPolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateOssPostPolicyResponseBodyOssPostPolicy self = new GenerateOssPostPolicyResponseBodyOssPostPolicy();
            return TeaModel.build(map, self);
        }

        public GenerateOssPostPolicyResponseBodyOssPostPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GenerateOssPostPolicyResponseBodyOssPostPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateOssPostPolicyResponseBodyOssPostPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateOssPostPolicyResponseBodyOssPostPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateOssPostPolicyResponseBodyOssPostPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

    }

}
