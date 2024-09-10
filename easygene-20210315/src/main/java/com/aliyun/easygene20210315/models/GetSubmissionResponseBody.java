// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetSubmissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Submission")
    public GetSubmissionResponseBodySubmission submission;

    public static GetSubmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubmissionResponseBody self = new GetSubmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubmissionResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetSubmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubmissionResponseBody setSubmission(GetSubmissionResponseBodySubmission submission) {
        this.submission = submission;
        return this;
    }
    public GetSubmissionResponseBodySubmission getSubmission() {
        return this.submission;
    }

    public static class GetSubmissionResponseBodySubmissionRunStats extends TeaModel {
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

        public static GetSubmissionResponseBodySubmissionRunStats build(java.util.Map<String, ?> map) throws Exception {
            GetSubmissionResponseBodySubmissionRunStats self = new GetSubmissionResponseBodySubmissionRunStats();
            return TeaModel.build(map, self);
        }

        public GetSubmissionResponseBodySubmissionRunStats setAborted(Long aborted) {
            this.aborted = aborted;
            return this;
        }
        public Long getAborted() {
            return this.aborted;
        }

        public GetSubmissionResponseBodySubmissionRunStats setAborting(Long aborting) {
            this.aborting = aborting;
            return this;
        }
        public Long getAborting() {
            return this.aborting;
        }

        public GetSubmissionResponseBodySubmissionRunStats setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSubmissionResponseBodySubmissionRunStats setPending(Long pending) {
            this.pending = pending;
            return this;
        }
        public Long getPending() {
            return this.pending;
        }

        public GetSubmissionResponseBodySubmissionRunStats setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public GetSubmissionResponseBodySubmissionRunStats setSubmitted(Long submitted) {
            this.submitted = submitted;
            return this;
        }
        public Long getSubmitted() {
            return this.submitted;
        }

        public GetSubmissionResponseBodySubmissionRunStats setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

    }

    public static class GetSubmissionResponseBodySubmission extends TeaModel {
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
        public GetSubmissionResponseBodySubmissionRunStats runStats;

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

        public static GetSubmissionResponseBodySubmission build(java.util.Map<String, ?> map) throws Exception {
            GetSubmissionResponseBodySubmission self = new GetSubmissionResponseBodySubmission();
            return TeaModel.build(map, self);
        }

        public GetSubmissionResponseBodySubmission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubmissionResponseBodySubmission setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSubmissionResponseBodySubmission setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetSubmissionResponseBodySubmission setRunStats(GetSubmissionResponseBodySubmissionRunStats runStats) {
            this.runStats = runStats;
            return this;
        }
        public GetSubmissionResponseBodySubmissionRunStats getRunStats() {
            return this.runStats;
        }

        public GetSubmissionResponseBodySubmission setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSubmissionResponseBodySubmission setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubmissionResponseBodySubmission setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public GetSubmissionResponseBodySubmission setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
