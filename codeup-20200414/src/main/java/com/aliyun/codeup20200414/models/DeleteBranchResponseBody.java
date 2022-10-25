// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteBranchResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteBranchResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBranchResponseBody self = new DeleteBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBranchResponseBody setResult(DeleteBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteBranchResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteBranchResponseBodyResult extends TeaModel {
        @NameInMap("BranchName")
        public String branchName;

        public static DeleteBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteBranchResponseBodyResult self = new DeleteBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteBranchResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

    }

}
