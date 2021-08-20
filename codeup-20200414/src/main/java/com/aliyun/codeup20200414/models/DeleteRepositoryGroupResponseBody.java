// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryGroupResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DeleteRepositoryGroupResponseBodyResult result;

    public static DeleteRepositoryGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryGroupResponseBody self = new DeleteRepositoryGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryGroupResponseBody setResult(DeleteRepositoryGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryGroupResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static DeleteRepositoryGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryGroupResponseBodyResult self = new DeleteRepositoryGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryGroupResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
