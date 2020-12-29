// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeUploadPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DescribeFabricChaincodeUploadPolicyResponseBodyResult result;

    public static DescribeFabricChaincodeUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeUploadPolicyResponseBody self = new DescribeFabricChaincodeUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChaincodeUploadPolicyResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChaincodeUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricChaincodeUploadPolicyResponseBody setResult(DescribeFabricChaincodeUploadPolicyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricChaincodeUploadPolicyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeFabricChaincodeUploadPolicyResponseBodyResult extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Expire")
        public Integer expire;

        public static DescribeFabricChaincodeUploadPolicyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChaincodeUploadPolicyResponseBodyResult self = new DescribeFabricChaincodeUploadPolicyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeFabricChaincodeUploadPolicyResponseBodyResult setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

    }

}
