// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryProtectedBranchResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public DeleteRepositoryProtectedBranchResponseBodyResult result;

    public static DeleteRepositoryProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryProtectedBranchResponseBody self = new DeleteRepositoryProtectedBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryProtectedBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryProtectedBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryProtectedBranchResponseBody setResult(DeleteRepositoryProtectedBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryProtectedBranchResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryProtectedBranchResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static DeleteRepositoryProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryProtectedBranchResponseBodyResult self = new DeleteRepositoryProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryProtectedBranchResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
