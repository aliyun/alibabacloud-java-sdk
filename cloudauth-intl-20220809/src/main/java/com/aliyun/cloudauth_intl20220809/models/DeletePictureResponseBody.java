// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeletePictureResponseBody extends TeaModel {
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
    public DeletePictureResponseBodyResult result;

    public static DeletePictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureResponseBody self = new DeletePictureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePictureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePictureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePictureResponseBody setResult(DeletePictureResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeletePictureResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeletePictureResponseBodyResult extends TeaModel {
        @NameInMap("DeleteResult")
        public String deleteResult;

        @NameInMap("TransactionId")
        public String transactionId;

        public static DeletePictureResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeletePictureResponseBodyResult self = new DeletePictureResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeletePictureResponseBodyResult setDeleteResult(String deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public String getDeleteResult() {
            return this.deleteResult;
        }

        public DeletePictureResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
