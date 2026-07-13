// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceAsyncTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateInstanceAsyncTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentStep")
        public String currentStep;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("TaskCode")
        public String taskCode;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

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
