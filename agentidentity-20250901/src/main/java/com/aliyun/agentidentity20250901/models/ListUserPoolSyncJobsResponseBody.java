// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolSyncJobsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationJobs")
    public java.util.List<ListUserPoolSyncJobsResponseBodySynchronizationJobs> synchronizationJobs;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserPoolSyncJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolSyncJobsResponseBody self = new ListUserPoolSyncJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPoolSyncJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolSyncJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserPoolSyncJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPoolSyncJobsResponseBody setSynchronizationJobs(java.util.List<ListUserPoolSyncJobsResponseBodySynchronizationJobs> synchronizationJobs) {
        this.synchronizationJobs = synchronizationJobs;
        return this;
    }
    public java.util.List<ListUserPoolSyncJobsResponseBodySynchronizationJobs> getSynchronizationJobs() {
        return this.synchronizationJobs;
    }

    public ListUserPoolSyncJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary extends TeaModel {
        @NameInMap("Created")
        public String created;

        @NameInMap("Deleted")
        public String deleted;

        @NameInMap("Same")
        public String same;

        @NameInMap("Updated")
        public String updated;

        public static ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary self = new ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary();
            return TeaModel.build(map, self);
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary setSame(String same) {
            this.same = same;
            return this;
        }
        public String getSame() {
            return this.same;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class ListUserPoolSyncJobsResponseBodySynchronizationJobs extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("JobSummary")
        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary jobSummary;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        @NameInMap("TriggerType")
        public String triggerType;

        public static ListUserPoolSyncJobsResponseBodySynchronizationJobs build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolSyncJobsResponseBodySynchronizationJobs self = new ListUserPoolSyncJobsResponseBodySynchronizationJobs();
            return TeaModel.build(map, self);
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setJobSummary(ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary jobSummary) {
            this.jobSummary = jobSummary;
            return this;
        }
        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary getJobSummary() {
            return this.jobSummary;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public ListUserPoolSyncJobsResponseBodySynchronizationJobs setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
