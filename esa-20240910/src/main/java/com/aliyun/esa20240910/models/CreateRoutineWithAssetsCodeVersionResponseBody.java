// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineWithAssetsCodeVersionResponseBody extends TeaModel {
    @NameInMap("CodeVersion")
    public String codeVersion;

    @NameInMap("OssPostConfig")
    public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig ossPostConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateRoutineWithAssetsCodeVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineWithAssetsCodeVersionResponseBody self = new CreateRoutineWithAssetsCodeVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineWithAssetsCodeVersionResponseBody setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public CreateRoutineWithAssetsCodeVersionResponseBody setOssPostConfig(CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig ossPostConfig) {
        this.ossPostConfig = ossPostConfig;
        return this;
    }
    public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig getOssPostConfig() {
        return this.ossPostConfig;
    }

    public CreateRoutineWithAssetsCodeVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineWithAssetsCodeVersionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("OSSAccessKeyId")
        public String OSSAccessKeyId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Url")
        public String url;

        @NameInMap("XOssSecurityToken")
        public String XOssSecurityToken;

        public static CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig self = new CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig();
            return TeaModel.build(map, self);
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setOSSAccessKeyId(String OSSAccessKeyId) {
            this.OSSAccessKeyId = OSSAccessKeyId;
            return this;
        }
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBodyOssPostConfig setXOssSecurityToken(String XOssSecurityToken) {
            this.XOssSecurityToken = XOssSecurityToken;
            return this;
        }
        public String getXOssSecurityToken() {
            return this.XOssSecurityToken;
        }

    }

}
