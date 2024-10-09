// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTasksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setData(DescribeTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTasksResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1724983927</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <strong>example:</strong>
         * <p>device not online</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <strong>example:</strong>
         * <p>1724983927</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>1724983927</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("TaskDescription")
        public String taskDescription;

        /**
         * <strong>example:</strong>
         * <p>{&quot;resourceTypes&quot;:[&quot;ACS::ECS::Instance&quot;,&quot;ACS::OSS::Bucket&quot;,&quot;ACS::OTS::Instance&quot;,&quot;ACS::NAS::FileSystem&quot;]}</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <strong>example:</strong>
         * <p>t-0000e4w0u1v592zdf6s7</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("TaskPriority")
        public String taskPriority;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>UPDATE_RESOURCES</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeTasksResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyDataContent self = new DescribeTasksResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyDataContent setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeTasksResponseBodyDataContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeTasksResponseBodyDataContent setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public DescribeTasksResponseBodyDataContent setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeTasksResponseBodyDataContent setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyDataContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeTasksResponseBodyDataContent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeTasksResponseBodyDataContent setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public DescribeTasksResponseBodyDataContent setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeTasksResponseBodyDataContent setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyDataContent setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeTasksResponseBodyDataContent setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public DescribeTasksResponseBodyDataContent setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeTasksResponseBodyDataContent setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeTasksResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<DescribeTasksResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>f4b8c2504545a3b41af5e75147d17d12e3818a0b9b2ff9a2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyData self = new DescribeTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyData setContent(java.util.List<DescribeTasksResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeTasksResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeTasksResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
