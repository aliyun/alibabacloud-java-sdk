// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolSyncJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Created")
        public String created;

        @NameInMap("Deleted")
        public String deleted;

        @NameInMap("Same")
        public String same;

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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("JobSummary")
        public GetUserPoolSyncJobResponseBodySynchronizationJobJobSummary jobSummary;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

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
