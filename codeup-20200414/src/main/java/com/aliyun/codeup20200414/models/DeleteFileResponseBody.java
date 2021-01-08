// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DeleteFileResponseBodyResult result;

    public static DeleteFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileResponseBody self = new DeleteFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteFileResponseBody setResult(DeleteFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteFileResponseBodyResult extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("BranchName")
        public String branchName;

        public static DeleteFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteFileResponseBodyResult self = new DeleteFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DeleteFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

    }

}
