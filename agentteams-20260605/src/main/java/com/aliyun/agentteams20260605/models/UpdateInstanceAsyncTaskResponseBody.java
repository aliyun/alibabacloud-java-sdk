// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>The status code in the success response.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public UpdateInstanceAsyncTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p><strong>message</strong></p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p><strong>requestId</strong></p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateInstanceAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAsyncTaskResponseBody self = new UpdateInstanceAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAsyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceAsyncTaskResponseBody setData(UpdateInstanceAsyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateInstanceAsyncTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateInstanceAsyncTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateInstanceAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceAsyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateInstanceAsyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T12:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The current step.</p>
         * 
         * <strong>example:</strong>
         * <p>create-cms-workspace</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>The time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T12:05:00Z</p>
         */
        @NameInMap("ModifiedAt")
        public String modifiedAt;

        /**
         * <p>The asynchronous task code. Only \&quot;agentteams:pay-order:create\&quot; is supported. Valid values:</p>
         * <ul>
         * <li>agentteams:pay-order:create: create instance task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentteams:pay-order:create</p>
         */
        @NameInMap("TaskCode")
        public String taskCode;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The asynchronous task status. Valid values:</p>
         * <ul>
         * <li>PENDING: pending.</li>
         * <li>RUNNING: running.</li>
         * <li>PAUSED: paused.</li>
         * <li>COMPLETED: completed.</li>
         * <li>FAILED: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Indicates whether the task is waiting for user action.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WaitingForUserAction")
        public Boolean waitingForUserAction;

        public static UpdateInstanceAsyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceAsyncTaskResponseBodyData self = new UpdateInstanceAsyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceAsyncTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public UpdateInstanceAsyncTaskResponseBodyData setWaitingForUserAction(Boolean waitingForUserAction) {
            this.waitingForUserAction = waitingForUserAction;
            return this;
        }
        public Boolean getWaitingForUserAction() {
            return this.waitingForUserAction;
        }

    }

}
