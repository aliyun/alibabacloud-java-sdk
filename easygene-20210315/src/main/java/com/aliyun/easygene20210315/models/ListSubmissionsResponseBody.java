// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListSubmissionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TestToken</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Submissions")
    public java.util.List<ListSubmissionsResponseBodySubmissions> submissions;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSubmissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubmissionsResponseBody self = new ListSubmissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubmissionsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListSubmissionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubmissionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSubmissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubmissionsResponseBody setSubmissions(java.util.List<ListSubmissionsResponseBodySubmissions> submissions) {
        this.submissions = submissions;
        return this;
    }
    public java.util.List<ListSubmissionsResponseBodySubmissions> getSubmissions() {
        return this.submissions;
    }

    public ListSubmissionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubmissionsResponseBodySubmissionsRunStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Aborted")
        public Long aborted;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Aborting")
        public Long aborting;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Pending")
        public Long pending;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Running")
        public Long running;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Submitted")
        public Long submitted;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Succeeded")
        public Long succeeded;

        public static ListSubmissionsResponseBodySubmissionsRunStats build(java.util.Map<String, ?> map) throws Exception {
            ListSubmissionsResponseBodySubmissionsRunStats self = new ListSubmissionsResponseBodySubmissionsRunStats();
            return TeaModel.build(map, self);
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setAborted(Long aborted) {
            this.aborted = aborted;
            return this;
        }
        public Long getAborted() {
            return this.aborted;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setAborting(Long aborting) {
            this.aborting = aborting;
            return this;
        }
        public Long getAborting() {
            return this.aborting;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setPending(Long pending) {
            this.pending = pending;
            return this;
        }
        public Long getPending() {
            return this.pending;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setSubmitted(Long submitted) {
            this.submitted = submitted;
            return this;
        }
        public Long getSubmitted() {
            return this.submitted;
        }

        public ListSubmissionsResponseBodySubmissionsRunStats setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

    }

    public static class ListSubmissionsResponseBodySubmissions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-06-16T15:09:14.378297+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2021-06-16T15:09:14.378297+08:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>TestEntityType</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("RunStats")
        public ListSubmissionsResponseBodySubmissionsRunStats runStats;

        /**
         * <strong>example:</strong>
         * <p>2021-06-16T15:09:14.378297+08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>sub-13BeXWnGvrOl3MC124tazcJVKaV</p>
         */
        @NameInMap("SubmissionId")
        public String submissionId;

        /**
         * <strong>example:</strong>
         * <p>TestWorkspace</p>
         */
        @NameInMap("Workspace")
        public String workspace;

        public static ListSubmissionsResponseBodySubmissions build(java.util.Map<String, ?> map) throws Exception {
            ListSubmissionsResponseBodySubmissions self = new ListSubmissionsResponseBodySubmissions();
            return TeaModel.build(map, self);
        }

        public ListSubmissionsResponseBodySubmissions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubmissionsResponseBodySubmissions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListSubmissionsResponseBodySubmissions setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListSubmissionsResponseBodySubmissions setRunStats(ListSubmissionsResponseBodySubmissionsRunStats runStats) {
            this.runStats = runStats;
            return this;
        }
        public ListSubmissionsResponseBodySubmissionsRunStats getRunStats() {
            return this.runStats;
        }

        public ListSubmissionsResponseBodySubmissions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListSubmissionsResponseBodySubmissions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubmissionsResponseBodySubmissions setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListSubmissionsResponseBodySubmissions setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
