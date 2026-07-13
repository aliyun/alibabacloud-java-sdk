// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceAsyncTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<GetInstanceAsyncTaskResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetInstanceAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAsyncTaskResponseBody self = new GetInstanceAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceAsyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceAsyncTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceAsyncTaskResponseBody setItems(java.util.List<GetInstanceAsyncTaskResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetInstanceAsyncTaskResponseBodyItems> getItems() {
        return this.items;
    }

    public GetInstanceAsyncTaskResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetInstanceAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceAsyncTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetInstanceAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceAsyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInstanceAsyncTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("OccurredAt")
        public String occurredAt;

        @NameInMap("RecoverySuggestion")
        public String recoverySuggestion;

        @NameInMap("Retryable")
        public Boolean retryable;

        @NameInMap("Source")
        public String source;

        @NameInMap("Type")
        public String type;

        public static GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage self = new GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage();
            return TeaModel.build(map, self);
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }
        public String getOccurredAt() {
            return this.occurredAt;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setRecoverySuggestion(String recoverySuggestion) {
            this.recoverySuggestion = recoverySuggestion;
            return this;
        }
        public String getRecoverySuggestion() {
            return this.recoverySuggestion;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceAsyncTaskResponseBodyItems extends TeaModel {
        @NameInMap("CurrentStep")
        public String currentStep;

        @NameInMap("RecoveryMessage")
        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage recoveryMessage;

        @NameInMap("TaskCode")
        public String taskCode;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("WaitingForUserAction")
        public Boolean waitingForUserAction;

        public static GetInstanceAsyncTaskResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceAsyncTaskResponseBodyItems self = new GetInstanceAsyncTaskResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceAsyncTaskResponseBodyItems setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public GetInstanceAsyncTaskResponseBodyItems setRecoveryMessage(GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage recoveryMessage) {
            this.recoveryMessage = recoveryMessage;
            return this;
        }
        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage getRecoveryMessage() {
            return this.recoveryMessage;
        }

        public GetInstanceAsyncTaskResponseBodyItems setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public GetInstanceAsyncTaskResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetInstanceAsyncTaskResponseBodyItems setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetInstanceAsyncTaskResponseBodyItems setWaitingForUserAction(Boolean waitingForUserAction) {
            this.waitingForUserAction = waitingForUserAction;
            return this;
        }
        public Boolean getWaitingForUserAction() {
            return this.waitingForUserAction;
        }

    }

}
