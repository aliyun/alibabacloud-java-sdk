// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("Result")
    public DocOcrResponseBodyResult result;

    public static DocOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocOcrResponseBody self = new DocOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public DocOcrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocOcrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocOcrResponseBody setResult(DocOcrResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DocOcrResponseBodyResult getResult() {
        return this.result;
    }

    public static class DocOcrResponseBodyResult extends TeaModel {
        /**
         * <p>Card and document recognition result	Only returned when the interface response is successful</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;idFaceQualityScore&quot;: 98.0
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;expiryDate&quot;: &quot;&quot;,
         *     &quot;originOfIssue&quot;: &quot;公安部出入境管理局&quot;,
         *     &quot;englishName&quot;: &quot;LI SI&quot;,
         *     &quot;sex&quot;: &quot;男&quot;,
         *     &quot;name&quot;: &quot;李四&quot;,
         *     &quot;idNumber&quot;: &quot;H11111112&quot;,
         *     &quot;issueDate&quot;: &quot;2013-01-02&quot;,
         *     &quot;birthDate&quot;: &quot;1990-02-21&quot;
         *   },
         *   &quot;spoofInfo&quot;: {
         *     &quot;spoofResult&quot;: &quot;Y&quot;,
         *     &quot;spoofType&quot;: [
         *       &quot;SCREEN_REMARK&quot;
         *     ]
         *   }
         * }</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Whether the authentication passed.</p>
         * <ul>
         * <li>Y: Passed</li>
         * <li>N: Not passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Sub-result code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Unique identifier of the authentication request</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DocOcrResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DocOcrResponseBodyResult self = new DocOcrResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DocOcrResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public DocOcrResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DocOcrResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DocOcrResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
