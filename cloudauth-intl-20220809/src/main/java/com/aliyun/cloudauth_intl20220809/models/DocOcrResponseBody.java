// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrResponseBody extends TeaModel {
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
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("SubCode")
        public String subCode;

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
