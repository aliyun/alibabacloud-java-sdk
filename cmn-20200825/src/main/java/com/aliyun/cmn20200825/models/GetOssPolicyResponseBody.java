// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOssPolicyResponseBody extends TeaModel {
    // 资源上传规则
    @NameInMap("OssPolicy")
    public GetOssPolicyResponseBodyOssPolicy ossPolicy;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetOssPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssPolicyResponseBody self = new GetOssPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssPolicyResponseBody setOssPolicy(GetOssPolicyResponseBodyOssPolicy ossPolicy) {
        this.ossPolicy = ossPolicy;
        return this;
    }
    public GetOssPolicyResponseBodyOssPolicy getOssPolicy() {
        return this.ossPolicy;
    }

    public GetOssPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssPolicyResponseBodyOssPolicy extends TeaModel {
        // 通行id
        @NameInMap("AccessId")
        public String accessId;

        // 目录
        @NameInMap("Directory")
        public String directory;

        // 过期时间
        @NameInMap("ExpireTime")
        public String expireTime;

        // 主机名
        @NameInMap("Host")
        public String host;

        // 通行规则
        @NameInMap("Policy")
        public String policy;

        // 签名
        @NameInMap("Signature")
        public String signature;

        public static GetOssPolicyResponseBodyOssPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetOssPolicyResponseBodyOssPolicy self = new GetOssPolicyResponseBodyOssPolicy();
            return TeaModel.build(map, self);
        }

        public GetOssPolicyResponseBodyOssPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetOssPolicyResponseBodyOssPolicy setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetOssPolicyResponseBodyOssPolicy setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetOssPolicyResponseBodyOssPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssPolicyResponseBodyOssPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssPolicyResponseBodyOssPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
