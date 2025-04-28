// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxResponseBody extends TeaModel {
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DocOcrMaxResponseBodyResult result;

    public static DocOcrMaxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxResponseBody self = new DocOcrMaxResponseBody();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocOcrMaxResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocOcrMaxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocOcrMaxResponseBody setResult(DocOcrMaxResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DocOcrMaxResponseBodyResult getResult() {
        return this.result;
    }

    public static class DocOcrMaxResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;docType&quot;: &quot;PPTW01&quot;,
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;passportNo&quot;: &quot;36*******&quot;,
         *     &quot;expiryDate&quot;: &quot;2032/02/10&quot;,
         *     &quot;placeOfBirth&quot;: &quot;TAIWAN&quot;,
         *     &quot;surname&quot;: &quot;CHEN&quot;,
         *     &quot;givenname&quot;: &quot;LIN-CHUN&quot;,
         *     &quot;countryCode&quot;: &quot;TWN&quot;,
         *     &quot;sex&quot;: &quot;F&quot;,
         *     &quot;personalNo&quot;: &quot;S22********&quot;,
         *     &quot;issueDate&quot;: &quot;2022/02/10&quot;,
         *     &quot;birthDate&quot;: &quot;1988/10/04&quot;
         *   }
         * }</p>
         */
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
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <strong>example:</strong>
         * <p>hk573be80f944d95ac812e0*******a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DocOcrMaxResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DocOcrMaxResponseBodyResult self = new DocOcrMaxResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DocOcrMaxResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public DocOcrMaxResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DocOcrMaxResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DocOcrMaxResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
