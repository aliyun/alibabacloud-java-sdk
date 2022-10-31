// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteFileResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteFileResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileResponseBody self = new DeleteFileResponseBody();
        return TeaModel.build(map, self);
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

    public DeleteFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFileResponseBody setResult(DeleteFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteFileResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteFileResponseBodyResult extends TeaModel {
        @NameInMap("branchName")
        public String branchName;

        @NameInMap("filePath")
        public String filePath;

        public static DeleteFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteFileResponseBodyResult self = new DeleteFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public DeleteFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

    }

}
