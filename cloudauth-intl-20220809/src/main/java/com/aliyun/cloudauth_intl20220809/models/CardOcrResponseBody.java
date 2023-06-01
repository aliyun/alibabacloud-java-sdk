// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CardOcrResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ExtCardInfo")
        public String extCardInfo;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("SubCode")
        public String subCode;

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
