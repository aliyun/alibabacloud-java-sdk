// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetFileStoreUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileStoreUploadPolicyResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetFileStoreUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileStoreUploadPolicyResponseBody self = new GetFileStoreUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileStoreUploadPolicyResponseBody setData(GetFileStoreUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileStoreUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetFileStoreUploadPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileStoreUploadPolicyResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetFileStoreUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileStoreUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileStoreUploadPolicyResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("Signature")
        public String signature;

        public static GetFileStoreUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileStoreUploadPolicyResponseBodyData self = new GetFileStoreUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileStoreUploadPolicyResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetFileStoreUploadPolicyResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetFileStoreUploadPolicyResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetFileStoreUploadPolicyResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetFileStoreUploadPolicyResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFileStoreUploadPolicyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetFileStoreUploadPolicyResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetFileStoreUploadPolicyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
