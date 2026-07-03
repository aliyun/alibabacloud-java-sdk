// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class IdnAuthorityVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public IdnAuthorityVerifyIntlResponseBodyResult result;

    public static IdnAuthorityVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdnAuthorityVerifyIntlResponseBody self = new IdnAuthorityVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public IdnAuthorityVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IdnAuthorityVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdnAuthorityVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdnAuthorityVerifyIntlResponseBody setResult(IdnAuthorityVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public IdnAuthorityVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class IdnAuthorityVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <p>The detailed verification results from the data source are described as follows (using the Indonesian data source as an example):</p>
         * <ul>
         * <li><strong>govId, fullName, dob</strong>: A comparison score equal to 1.0 indicates a complete match with the official data source. A score lower than 1.0 indicates a mismatch. </li>
         * <li><strong>selfiePhoto</strong>: A comparison score greater than 0.8 indicates a match with the official data source. A score equal to or lower than 0.8 indicates a mismatch. </li>
         * <li><strong>liveness</strong>: A score higher than 0.95 indicates a liveness detection risk. </li>
         * <li><strong>imgManipulationScore</strong>: A score higher than 0.95 indicates an image tampering risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;govId&quot;: 1.0,
         *   &quot;fullName&quot;: 1.0,
         *   &quot;dob&quot;: 0.9,
         *   &quot;selfiePhoto&quot;: 0.8777,
         *   &quot;liveness&quot;: 0.1152,
         *   &quot;imgManipulationScore&quot;: 0.2253
         * }</p>
         */
        @NameInMap("ExtSourceInfo")
        public String extSourceInfo;

        /**
         * <p>Indicates whether the verification is passed. Valid values:</p>
         * <ul>
         * <li>Y: passed.</li>
         * <li>N: not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The unique identifier of the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>hk573be80f944d95ac812e0*******a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static IdnAuthorityVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            IdnAuthorityVerifyIntlResponseBodyResult self = new IdnAuthorityVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public IdnAuthorityVerifyIntlResponseBodyResult setExtSourceInfo(String extSourceInfo) {
            this.extSourceInfo = extSourceInfo;
            return this;
        }
        public String getExtSourceInfo() {
            return this.extSourceInfo;
        }

        public IdnAuthorityVerifyIntlResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public IdnAuthorityVerifyIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public IdnAuthorityVerifyIntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
