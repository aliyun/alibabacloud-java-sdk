// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F8053E32-9623-511F-8B46-F0E5FD206524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateFileResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileResponseBody self = new CreateFileResponseBody();
        return TeaModel.build(map, self);
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

    public CreateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileResponseBody setResult(CreateFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFileResponseBodyResult getResult() {
        return this.result;
    }

    public CreateFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFileResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>/src/main/test.java</p>
         */
        @NameInMap("filePath")
        public String filePath;

        public static CreateFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFileResponseBodyResult self = new CreateFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFileResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public CreateFileResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

    }

}
