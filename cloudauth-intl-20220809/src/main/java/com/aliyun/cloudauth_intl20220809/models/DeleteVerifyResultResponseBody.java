// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteVerifyResultResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>ID of this request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("Result")
    public DeleteVerifyResultResponseBodyResult result;

    public static DeleteVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifyResultResponseBody self = new DeleteVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVerifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteVerifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVerifyResultResponseBody setResult(DeleteVerifyResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteVerifyResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteVerifyResultResponseBodyResult extends TeaModel {
        /**
         * <p>Deletion result. Y indicates successful deletion, N indicates failed deletion</p>
         * 
         * <strong>example:</strong>
         * <p>Y/N</p>
         */
        @NameInMap("DeleteResult")
        public String deleteResult;

        /**
         * <p>Unique identifier of the authentication request</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DeleteVerifyResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteVerifyResultResponseBodyResult self = new DeleteVerifyResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteVerifyResultResponseBodyResult setDeleteResult(String deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public String getDeleteResult() {
            return this.deleteResult;
        }

        public DeleteVerifyResultResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
