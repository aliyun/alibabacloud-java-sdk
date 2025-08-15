// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CardOcrResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message</p>
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
     * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("Result")
    public CardOcrResponseBodyResult result;

    public static CardOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CardOcrResponseBody self = new CardOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public CardOcrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CardOcrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CardOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CardOcrResponseBody setResult(CardOcrResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CardOcrResponseBodyResult getResult() {
        return this.result;
    }

    public static class CardOcrResponseBodyResult extends TeaModel {
        /**
         * <p>Document recognition result</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;idFaceQualityScore&quot;: 98.90,
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;expiryDate&quot;: &quot;2024-04-20&quot;,
         *     &quot;placeOfIssue&quot;: &quot;广东&quot;,
         *     &quot;englishName&quot;: &quot;ZHENGJIAN,YANGBEN&quot;,
         *     &quot;originOfIssue&quot;: &quot;公安部出入境管理局&quot;,
         *     &quot;sex&quot;: &quot;女&quot;,
         *     &quot;name&quot;: &quot;证件样本&quot;,
         *     &quot;idNumber&quot;: &quot;C00000000&quot;,
         *     &quot;issueDate&quot;: &quot;2014-04-21&quot;,
         *     &quot;birthDate&quot;: &quot;1981-08-03&quot;
         *   },
         *   &quot;spoofInfo&quot;: {
         *     &quot;spoofResult&quot;: &quot;N&quot;,
         *     &quot;spoofType&quot;: [
         *       &quot;SCREEN_REMARK&quot;
         *     ]
         *   }
         * }</p>
         */
        @NameInMap("ExtCardInfo")
        public String extCardInfo;

        /**
         * <p>Additional result information</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Whether the authentication passed.</p>
         * <ul>
         * <li>Y: Passed.</li>
         * <li>N: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Unique identifier for the authentication request</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static CardOcrResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CardOcrResponseBodyResult self = new CardOcrResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CardOcrResponseBodyResult setExtCardInfo(String extCardInfo) {
            this.extCardInfo = extCardInfo;
            return this;
        }
        public String getExtCardInfo() {
            return this.extCardInfo;
        }

        public CardOcrResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CardOcrResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public CardOcrResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public CardOcrResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
