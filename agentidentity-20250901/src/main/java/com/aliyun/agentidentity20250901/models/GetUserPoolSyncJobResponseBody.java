// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolSyncJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The synchronization task information.</p>
     */
    @NameInMap("SynchronizationJob")
    public GetUserPoolSyncJobResponseBodySynchronizationJob synchronizationJob;

    public static GetUserPoolSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolSyncJobResponseBody self = new GetUserPoolSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPoolSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserPoolSyncJobResponseBody setSynchronizationJob(GetUserPoolSyncJobResponseBodySynchronizationJob synchronizationJob) {
        this.synchronizationJob = synchronizationJob;
        return this;
    }
    public GetUserPoolSyncJobResponseBodySynchronizationJob getSynchronizationJob() {
        return this.synchronizationJob;
    }

    public static class GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary extends TeaModel {
        /**
         * <p>The statistics of created users in JSON format, including the following four fields: total (total count), success (success count), failed (failure count), and skipped (skipped count).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:24,&quot;success&quot;:24,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The statistics of deleted users in JSON format, including the following four fields: total (total count), success (success count), failed (failure count), and skipped (skipped count).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        /**
         * <p>The statistics of unchanged users in JSON format, including the following four fields: total (total count), success (success count), failed (failure count), and skipped (skipped count).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Same")
        public String same;

        /**
         * <p>The statistics of updated users in JSON format, including the following four fields: total (total count), success (success count), failed (failure count), and skipped (skipped count).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Updated")
        public String updated;

        public static GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary build(java.util.Map<String, ?> map) throws Exception {
            GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary self = new GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary();
            return TeaModel.build(map, self);
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary setSame(String same) {
            this.same = same;
            return this;
        }
        public String getSame() {
            return this.same;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class GetUserPoolSyncJobResponseBodySynchronizationJob extends TeaModel {
        /**
         * <p>The end time of the synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T10:13:35Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The type of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>The synchronization result statistics information.</p>
         */
        @NameInMap("JobSummary")
        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary jobSummary;

        /**
         * <p>The start time of the synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T10:13:35Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the synchronization task. Valid values:</p>
         * <ul>
         * <li><p>Pending: The initial state.</p>
         * </li>
         * <li><p>Running: The task is running.</p>
         * </li>
         * <li><p>Failed: The task failed.</p>
         * </li>
         * <li><p>PartialSuccess: The task partially succeeded.</p>
         * </li>
         * <li><p>Success: The task succeeded.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>syncjob_8d713b14a63b4a559753492ab51c31f3</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>The trigger type of the synchronization task. Valid values: Manual (manually triggered). Only manual triggering is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static GetUserPoolSyncJobResponseBodySynchronizationJob build(java.util.Map<String, ?> map) throws Exception {
            GetUserPoolSyncJobResponseBodySynchronizationJob self = new GetUserPoolSyncJobResponseBodySynchronizationJob();
            return TeaModel.build(map, self);
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setJobSummary(GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary jobSummary) {
            this.jobSummary = jobSummary;
            return this;
        }
        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary getJobSummary() {
            return this.jobSummary;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public GetUserPoolSyncJobResponseBodySynchronizationJob setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
