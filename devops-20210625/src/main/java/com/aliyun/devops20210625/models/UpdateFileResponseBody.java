// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFileResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateFileResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileResponseBody self = new UpdateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public UpdateFileResponseBody setResult(UpdateFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateFileResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateFileResponseBodyResult extends TeaModel {
        @NameInMap("branchName")
        public String branchName;

        @NameInMap("filePath")
        public String filePath;

        public static UpdateFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateFileResponseBodyResult self = new UpdateFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public UpdateFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

    }

}
