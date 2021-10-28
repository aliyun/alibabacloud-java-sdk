// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListSubmissionsResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 最大返回结果
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 下次查询Token
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 投递列表
    @NameInMap("Submissions")
    public java.util.List<ListSubmissionsResponseBodySubmissions> submissions;

    // 返回个数
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
        // 已取消数量
        @NameInMap("Aborted")
        public Long aborted;

        // 取消中数量
        @NameInMap("Aborting")
        public Long aborting;

        // 已失败数量
        @NameInMap("Failed")
        public Long failed;

        // 等待中数量
        @NameInMap("Pending")
        public Long pending;

        // 运行中数量
        @NameInMap("Running")
        public Long running;

        // 已提交数量
        @NameInMap("Submitted")
        public Long submitted;

        // 已成功数量
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
        // 提交时间
        @NameInMap("CreateTime")
        public String createTime;

        // 结束时间
        @NameInMap("EndTime")
        public String endTime;

        // 实体类型
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("RunStats")
        public ListSubmissionsResponseBodySubmissionsRunStats runStats;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 提交ID
        @NameInMap("SubmissionId")
        public String submissionId;

        // 工作空间名字
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
