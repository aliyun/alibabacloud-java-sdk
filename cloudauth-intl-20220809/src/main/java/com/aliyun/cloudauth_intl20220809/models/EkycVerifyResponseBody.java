// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EkycVerifyResponseBodyResult result;

    public static EkycVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyResponseBody self = new EkycVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public EkycVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EkycVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EkycVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EkycVerifyResponseBody setResult(EkycVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EkycVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class EkycVerifyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         * &quot;faceAttack&quot;: &quot;N&quot;,
         * &quot;faceComparisonScore&quot;: 52.57,
         * &quot;facePassed&quot;: &quot;N&quot;,
         * &quot;authorityComparisonScore&quot;: 80.39
         * }</p>
         */
        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static EkycVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EkycVerifyResponseBodyResult self = new EkycVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EkycVerifyResponseBodyResult setExtFaceInfo(String extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public String getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public EkycVerifyResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public EkycVerifyResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public EkycVerifyResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public EkycVerifyResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
