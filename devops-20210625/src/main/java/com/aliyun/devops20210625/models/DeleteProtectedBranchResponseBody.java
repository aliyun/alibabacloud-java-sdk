// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProtectedBranchResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteProtectedBranchResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectedBranchResponseBody self = new DeleteProtectedBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteProtectedBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteProtectedBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProtectedBranchResponseBody setResult(DeleteProtectedBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteProtectedBranchResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteProtectedBranchResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static DeleteProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteProtectedBranchResponseBodyResult self = new DeleteProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteProtectedBranchResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
