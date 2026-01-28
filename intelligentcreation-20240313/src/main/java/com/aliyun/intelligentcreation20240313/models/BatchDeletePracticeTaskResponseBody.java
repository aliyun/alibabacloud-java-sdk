// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchDeletePracticeTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>040002</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>10923AA3-F7A1-5EA0-ACCA-D704269EAA78</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<BatchDeletePracticeTaskResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BatchDeletePracticeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePracticeTaskResponseBody self = new BatchDeletePracticeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeletePracticeTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchDeletePracticeTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchDeletePracticeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeletePracticeTaskResponseBody setResults(java.util.List<BatchDeletePracticeTaskResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchDeletePracticeTaskResponseBodyResults> getResults() {
        return this.results;
    }

    public BatchDeletePracticeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchDeletePracticeTaskResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>job delete error by auth</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>901524394325590016</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static BatchDeletePracticeTaskResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchDeletePracticeTaskResponseBodyResults self = new BatchDeletePracticeTaskResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchDeletePracticeTaskResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDeletePracticeTaskResponseBodyResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
