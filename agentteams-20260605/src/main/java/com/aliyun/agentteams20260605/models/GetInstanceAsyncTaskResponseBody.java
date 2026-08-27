// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>SUCCESS</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned list. The <code>items</code> array may contain multiple tasks with the same <code>taskCode</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<GetInstanceAsyncTaskResponseBodyItems> items;

    /**
     * <p>The page size. Default value: 100. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next page. This parameter is not returned for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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

    /**
     * <p>The total number of tasks.</p>
     * 
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
        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>CMS_WORKSPACE_QUOTA_EXCEEDED: CMS workspace quota exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMS_WORKSPACE_QUOTA_EXCEEDED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The specific error message.</p>
         * 
         * <strong>example:</strong>
         * <p>CMS workspace quota exceeded</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T12:00:00Z</p>
         */
        @NameInMap("OccurredAt")
        public String occurredAt;

        /**
         * <p>The suggested recovery action.</p>
         * 
         * <strong>example:</strong>
         * <p>Please increase the CMS workspace quota or clean up unused workspaces.</p>
         */
        @NameInMap("RecoverySuggestion")
        public String recoverySuggestion;

        /**
         * <p>Indicates whether the task can be retried.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retryable")
        public Boolean retryable;

        /**
         * <p>The error source. Valid values:</p>
         * <ul>
         * <li>CMS: content management system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMS</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The recovery type. Valid values:</p>
         * <ul>
         * <li>ERROR_RECOVERY: error recovery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ERROR_RECOVERY</p>
         */
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
        /**
         * <p>The current step.</p>
         * 
         * <strong>example:</strong>
         * <p>create-cms-workspace</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>The recovery message returned to the user when the task status is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("RecoveryMessage")
        public GetInstanceAsyncTaskResponseBodyItemsRecoveryMessage recoveryMessage;

        /**
         * <p>The task code. Valid values:</p>
         * <ul>
         * <li>LIFECYCLE_MAGIC_PAY_ORDER_CALLBACK_CREATE: instance creation task.</li>
         * <li>MAGIC_BIND_IDENTITY_PROVIDER: upstream identity provider binding task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIFECYCLE_MAGIC_PAY_ORDER_CALLBACK_CREATE</p>
         */
        @NameInMap("TaskCode")
        public String taskCode;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PAUSED: paused.</li>
         * <li>RUNNING: running.</li>
         * <li>SUCCEEDED: succeeded.</li>
         * <li>FAILED: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAUSED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Indicates whether the task is waiting for user action. When <code>taskStatus = PAUSED</code>, this value is true and <code>recoveryMessage</code> is returned to display recovery instructions to the user. When the task is not paused, this value is false and <code>recoveryMessage</code> is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
