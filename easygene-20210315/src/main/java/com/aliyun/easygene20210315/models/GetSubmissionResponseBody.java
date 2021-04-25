// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetSubmissionResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 投递列表
    @NameInMap("Submission")
    public GetSubmissionResponseBodySubmission submission;

    public static GetSubmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubmissionResponseBody self = new GetSubmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubmissionResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetSubmissionResponseBody setSubmission(GetSubmissionResponseBodySubmission submission) {
        this.submission = submission;
        return this;
    }
    public GetSubmissionResponseBodySubmission getSubmission() {
        return this.submission;
    }

    public static class GetSubmissionResponseBodySubmissionRunStats extends TeaModel {
        @NameInMap("Submitted")
        public Long submitted;

        @NameInMap("Pending")
        public Long pending;

        @NameInMap("Running")
        public Long running;

        @NameInMap("Succeeded")
        public Long succeeded;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Aborting")
        public Long aborting;

        @NameInMap("Aborted")
        public Long aborted;

        public static GetSubmissionResponseBodySubmissionRunStats build(java.util.Map<String, ?> map) throws Exception {
            GetSubmissionResponseBodySubmissionRunStats self = new GetSubmissionResponseBodySubmissionRunStats();
            return TeaModel.build(map, self);
        }

        public GetSubmissionResponseBodySubmissionRunStats setSubmitted(Long submitted) {
            this.submitted = submitted;
            return this;
        }
        public Long getSubmitted() {
            return this.submitted;
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

        public GetSubmissionResponseBodySubmissionRunStats setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

        public GetSubmissionResponseBodySubmissionRunStats setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSubmissionResponseBodySubmissionRunStats setAborting(Long aborting) {
            this.aborting = aborting;
            return this;
        }
        public Long getAborting() {
            return this.aborting;
        }

        public GetSubmissionResponseBodySubmissionRunStats setAborted(Long aborted) {
            this.aborted = aborted;
            return this;
        }
        public Long getAborted() {
            return this.aborted;
        }

    }

    public static class GetSubmissionResponseBodySubmission extends TeaModel {
        // 提交ID
        @NameInMap("Workspace")
        public String workspace;

        // 提交ID
        @NameInMap("SubmissionId")
        public String submissionId;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 提交时间
        @NameInMap("CreateTime")
        public String createTime;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        // 结束时间
        @NameInMap("EndTime")
        public String endTime;

        // 实体类型
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("RunStats")
        public GetSubmissionResponseBodySubmissionRunStats runStats;

        public static GetSubmissionResponseBodySubmission build(java.util.Map<String, ?> map) throws Exception {
            GetSubmissionResponseBodySubmission self = new GetSubmissionResponseBodySubmission();
            return TeaModel.build(map, self);
        }

        public GetSubmissionResponseBodySubmission setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetSubmissionResponseBodySubmission setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public GetSubmissionResponseBodySubmission setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubmissionResponseBodySubmission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubmissionResponseBodySubmission setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

    }

}
