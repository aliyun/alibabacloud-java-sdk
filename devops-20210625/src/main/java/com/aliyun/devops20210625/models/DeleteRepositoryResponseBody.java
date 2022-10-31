// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRepositoryResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryResponseBody self = new DeleteRepositoryResponseBody();
        return TeaModel.build(map, self);
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

    public DeleteRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryResponseBody setResult(DeleteRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("result")
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
