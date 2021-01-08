// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFileResponseBodyResult result;

    public static CreateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileResponseBody self = new CreateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFileResponseBody setResult(CreateFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFileResponseBodyResult extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("BranchName")
        public String branchName;

        public static CreateFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFileResponseBodyResult self = new CreateFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public CreateFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

    }

}
