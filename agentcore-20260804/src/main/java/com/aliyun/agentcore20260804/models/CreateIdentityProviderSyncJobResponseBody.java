// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderSyncJobResponseBody extends TeaModel {
    /**
     * <p>The business status code of the API request. A value of SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;12345678-1234-4234-8234-123456789abc&quot;,&quot;status&quot;:&quot;PENDING&quot;}</p>
     */
    @NameInMap("data")
    public CreateIdentityProviderSyncJobResponseBodyData data;

    /**
     * <p>The HTTP status code of the API request. This status code does not indicate the execution result of the asynchronous task.</p>
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
     * <p>Indicates whether the API request is successful. To check whether the asynchronous task is completed, query the task status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateIdentityProviderSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderSyncJobResponseBody self = new CreateIdentityProviderSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderSyncJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIdentityProviderSyncJobResponseBody setData(CreateIdentityProviderSyncJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIdentityProviderSyncJobResponseBodyData getData() {
        return this.data;
    }

    public CreateIdentityProviderSyncJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateIdentityProviderSyncJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIdentityProviderSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIdentityProviderSyncJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIdentityProviderSyncJobResponseBodyData extends TeaModel {
        /**
         * <p>The current execution step of the AgentCore asynchronous task. This parameter may not be returned if the task has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        @NameInMap("currentStep")
        public String currentStep;

        /**
         * <p>The failure summary of the asynchronous task. This parameter is not returned if no failure information is available. You can use this parameter together with taskId and requestId to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>The identity provider synchronization job failed.</p>
         */
        @NameInMap("failureReason")
        public String failureReason;

        /**
         * <p>The status of the synchronization task. Valid values:</p>
         * <ul>
         * <li>PENDING: Pending.</li>
         * <li>RUNNING: Running.</li>
         * <li>PAUSED: Paused.</li>
         * <li>SUCCESS: Successful.</li>
         * <li>FAILED: Failed.</li>
         * <li>CANCELED: Canceled.
         * The first three values are non-terminal states, and the last three values are terminal states. Query the status until a terminal state is reached to determine the result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of user entries that are locally read and written or updated, including existing users. This number does not represent the number of new users or the synchronization percentage. This parameter is not returned if no statistics are available.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("syncedUserCount")
        public Integer syncedUserCount;

        /**
         * <p>The downstream AgentIdentity synchronization task ID. This parameter is not returned if the task is not created. You cannot use this ID instead of taskId to call GetIdentityProviderSyncJob.</p>
         * 
         * <strong>example:</strong>
         * <p>syncjob_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("synchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>The local AgentCore task ID returned by CreateIdentityProviderSyncJob. This is not the synchronizationJobId of AgentIdentity. You must use the same workspace and identity provider when you query the task.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateIdentityProviderSyncJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderSyncJobResponseBodyData self = new CreateIdentityProviderSyncJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderSyncJobResponseBodyData setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public CreateIdentityProviderSyncJobResponseBodyData setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public CreateIdentityProviderSyncJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateIdentityProviderSyncJobResponseBodyData setSyncedUserCount(Integer syncedUserCount) {
            this.syncedUserCount = syncedUserCount;
            return this;
        }
        public Integer getSyncedUserCount() {
            return this.syncedUserCount;
        }

        public CreateIdentityProviderSyncJobResponseBodyData setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public CreateIdentityProviderSyncJobResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
