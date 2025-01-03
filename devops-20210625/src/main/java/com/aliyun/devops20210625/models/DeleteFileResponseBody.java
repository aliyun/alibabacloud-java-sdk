// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteFileResponseBody extends TeaModel {
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
     * <p>7EFAD5FB-2296-5D52-BC60-FCC992A40767</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteFileResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>src/main/delete.java</p>
         */
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
