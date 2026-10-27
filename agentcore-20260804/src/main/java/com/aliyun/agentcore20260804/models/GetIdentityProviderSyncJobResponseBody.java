// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncJobResponseBody extends TeaModel {
    /**
     * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data returned by the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;12345678-1234-4234-8234-123456789abc&quot;,&quot;status&quot;:&quot;SUCCESS&quot;,&quot;currentStep&quot;:&quot;SYNC&quot;,&quot;synchronizationJobId&quot;:&quot;syncjob_0123456789abcdef0123456789abcdef&quot;,&quot;syncedUserCount&quot;:12}</p>
     */
    @NameInMap("data")
    public GetIdentityProviderSyncJobResponseBodyData data;

    /**
     * <p>The HTTP status code of the API request. It does not indicate the execution result of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request. Provide this value when you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API request is successful. To determine whether the asynchronous task is completed, query the task status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetIdentityProviderSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncJobResponseBody self = new GetIdentityProviderSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderSyncJobResponseBody setData(GetIdentityProviderSyncJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderSyncJobResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderSyncJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderSyncJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderSyncJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderSyncJobResponseBodyData extends TeaModel {
        /**
         * <p>The current execution step of the AgentCore asynchronous task. This field may not be returned if the task has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        @NameInMap("currentStep")
        public String currentStep;

        /**
         * <p>The failure summary of the asynchronous task. This field is not returned if there is no failure information. You can use the taskId and requestId for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>The identity provider synchronization job failed.</p>
         */
        @NameInMap("failureReason")
        public String failureReason;

        /**
         * <p>The status of the synchronization task. Valid values:</p>
         * <ul>
         * <li>PENDING: The task is pending execution.</li>
         * <li>RUNNING: The task is running.</li>
         * <li>PAUSED: The task is paused.</li>
         * <li>SUCCESS: The task is successful.</li>
         * <li>FAILED: The task failed.</li>
         * <li>CANCELED: The task is canceled.
         * The first three values are non-terminal states, and the last three values are terminal states. Query the task until it reaches a terminal state to determine the result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of user entries that have been locally read and written or updated, including existing users. This value does not represent the number of newly added users or the synchronization percentage. This field is not returned when no statistics are available.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("syncedUserCount")
        public Integer syncedUserCount;

        /**
         * <p>The downstream synchronization task ID of AgentIdentity. This field is not returned if the task has not been created. It cannot replace the taskId to call GetIdentityProviderSyncJob.</p>
         * 
         * <strong>example:</strong>
         * <p>syncjob_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("synchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>The local task ID of AgentCore returned by CreateIdentityProviderSyncJob. It is not the synchronizationJobId of AgentIdentity. The same workspace and identity provider must be used for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetIdentityProviderSyncJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncJobResponseBodyData self = new GetIdentityProviderSyncJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncJobResponseBodyData setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public GetIdentityProviderSyncJobResponseBodyData setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetIdentityProviderSyncJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIdentityProviderSyncJobResponseBodyData setSyncedUserCount(Integer syncedUserCount) {
            this.syncedUserCount = syncedUserCount;
            return this;
        }
        public Integer getSyncedUserCount() {
            return this.syncedUserCount;
        }

        public GetIdentityProviderSyncJobResponseBodyData setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public GetIdentityProviderSyncJobResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
