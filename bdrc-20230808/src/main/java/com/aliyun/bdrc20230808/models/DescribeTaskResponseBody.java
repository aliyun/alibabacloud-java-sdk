// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeTaskResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14DFF801-A4E3-5136-AAB8-7D246012CD7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskResponseBody self = new DescribeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskResponseBody setData(DescribeTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTaskResponseBodyData extends TeaModel {
        /**
         * <p>The completion time, formatted as a Unix timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724983927</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The error message returned if the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>too many requests.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The execution ID. This parameter is deprecated and always returns an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>The expiration time, formatted as a Unix timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719026680</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The task\&quot;s progress, measured on a scale of 0 to 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>784076D6-BD6D-5564-9CEA-834EB11F0C62</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The start time, formatted as a Unix timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724983927</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("TaskDescription")
        public String taskDescription;

        /**
         * <p>The details of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;resourceTypes&quot;:[&quot;ACS::ECS::Instance&quot;,&quot;ACS::OSS::Bucket&quot;,&quot;ACS::OTS::Instance&quot;,&quot;ACS::NAS::FileSystem&quot;]}</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test5566</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task priority. Valid values: <code>HIGH</code> (typically for user-initiated tasks) and <code>LOW</code> (typically for background tasks).</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("TaskPriority")
        public String taskPriority;

        /**
         * <p>The result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;resourceCounts&quot;:[{&quot;resourceType&quot;:&quot;ACS::OSS::Bucket&quot;,&quot;count&quot;:2},{&quot;resourceType&quot;:&quot;ACS::NAS::FileSystem&quot;,&quot;count&quot;:3}]}</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>The status of the task. Valid values: <code>CREATED</code> (Created), <code>RUNNING</code> (Running), <code>COMPLETE</code> (Completed), <code>FAILED</code> (Failed), <code>EXPIRED</code> (Expired), and <code>CANCELED</code> (Canceled).</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The task type. Valid values: <code>UPDATE_RESOURCES</code> (updates resources and their statuses) and <code>CHECK_RULES</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE_RESOURCES</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskResponseBodyData self = new DescribeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTaskResponseBodyData setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeTaskResponseBodyData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public DescribeTaskResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTaskResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeTaskResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeTaskResponseBodyData setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public DescribeTaskResponseBodyData setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeTaskResponseBodyData setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public DescribeTaskResponseBodyData setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public DescribeTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
