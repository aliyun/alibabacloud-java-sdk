// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DeleteRepositoryResponseBodyResult result;

    public static DeleteRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryResponseBody self = new DeleteRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryResponseBody setResult(DeleteRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static DeleteRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryResponseBodyResult self = new DeleteRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
