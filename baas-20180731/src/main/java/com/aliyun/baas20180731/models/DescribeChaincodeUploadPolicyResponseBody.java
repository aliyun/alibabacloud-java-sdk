// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeUploadPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeChaincodeUploadPolicyResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeChaincodeUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeUploadPolicyResponseBody self = new DescribeChaincodeUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeUploadPolicyResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeChaincodeUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChaincodeUploadPolicyResponseBody setResult(DescribeChaincodeUploadPolicyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeChaincodeUploadPolicyResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeChaincodeUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeChaincodeUploadPolicyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>accessId</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>test3/4bd1de21-2fff-4405-a8e9-f864c4bee24f</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("Expire")
        public Integer expire;

        /**
         * <strong>example:</strong>
         * <p><a href="https://chaincode.oss-cn-beijing.aliyuncs.com">https://chaincode.oss-cn-beijing.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAxOC0wNy0zMVQwODoyNjozMC40NzdaIiwiY29uZGl</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>signature</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static DescribeChaincodeUploadPolicyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeChaincodeUploadPolicyResponseBodyResult self = new DescribeChaincodeUploadPolicyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeChaincodeUploadPolicyResponseBodyResult setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
