// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetSubmissionResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

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
        @NameInMap("Aborted")
        public Long aborted;

        @NameInMap("Aborting")
        public Long aborting;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Pending")
        public Long pending;

        @NameInMap("Running")
        public Long running;

        @NameInMap("Submitted")
        public Long submitted;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("RunStats")
        public GetSubmissionResponseBodySubmissionRunStats runStats;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmissionId")
        public String submissionId;

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
