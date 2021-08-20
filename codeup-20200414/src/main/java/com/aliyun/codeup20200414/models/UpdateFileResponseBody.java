// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateFileResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpdateFileResponseBodyResult result;

    public static UpdateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileResponseBody self = new UpdateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateFileResponseBody setResult(UpdateFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateFileResponseBodyResult extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("BranchName")
        public String branchName;

        public static UpdateFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateFileResponseBodyResult self = new UpdateFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public UpdateFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

    }

}
