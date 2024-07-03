// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateStorageAnalysisTaskResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStorageAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageAnalysisTaskResponseBody self = new CreateStorageAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageAnalysisTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateStorageAnalysisTaskResponseBody setData(CreateStorageAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStorageAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateStorageAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStorageAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStorageAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the task is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CreateTaskSuccess")
        public Boolean createTaskSuccess;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>910f83f4b96df0524ddc5749f61539f8</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateStorageAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageAnalysisTaskResponseBodyData self = new CreateStorageAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStorageAnalysisTaskResponseBodyData setCreateTaskSuccess(Boolean createTaskSuccess) {
            this.createTaskSuccess = createTaskSuccess;
            return this;
        }
        public Boolean getCreateTaskSuccess() {
            return this.createTaskSuccess;
        }

        public CreateStorageAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateStorageAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
