// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>C2F153F6-BB43-50C4-9F4F-40593203E19A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateFileResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>src/main/update.txt</p>
         */
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
