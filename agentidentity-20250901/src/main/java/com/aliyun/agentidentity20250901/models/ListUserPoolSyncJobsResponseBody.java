// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolSyncJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationJobs")
    public java.util.List<ListUserPoolSyncJobsResponseBodySynchronizationJobs> synchronizationJobs;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        /**
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
        @NameInMap("Same")
        public String same;

        /**
         * <strong>example:</strong>
         * <p>{&quot;total&quot;:0,&quot;success&quot;:0,&quot;failed&quot;:0,&quot;skipped&quot;:0}</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2025-12-15T01:50:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("JobSummary")
        public ListUserPoolSyncJobsResponseBodySynchronizationJobsJobSummary jobSummary;

        /**
         * <strong>example:</strong>
         * <p>2026-01-13T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>syncjob_8d713b14a63b4a559753492ab51c31f3</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
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
