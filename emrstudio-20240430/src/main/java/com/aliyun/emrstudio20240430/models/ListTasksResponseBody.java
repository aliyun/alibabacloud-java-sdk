// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListTasksResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setData(java.util.List<ListTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListTasksResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailRetryInterval")
        public Integer failRetryInterval;

        @NameInMap("FailRetryTimes")
        public Integer failRetryTimes;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ResourceIds")
        public String resourceIds;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskParams")
        public String taskParams;

        @NameInMap("TaskPriority")
        public String taskPriority;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("TimeoutFlag")
        public String timeoutFlag;

        @NameInMap("TimeoutNotifyStrategy")
        public String timeoutNotifyStrategy;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Version")
        public String version;

        public static ListTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyData self = new ListTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyData setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public ListTasksResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTasksResponseBodyData setFailRetryInterval(Integer failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Integer getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public ListTasksResponseBodyData setFailRetryTimes(Integer failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Integer getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public ListTasksResponseBodyData setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ListTasksResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListTasksResponseBodyData setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public ListTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTasksResponseBodyData setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListTasksResponseBodyData setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public ListTasksResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTasksResponseBodyData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListTasksResponseBodyData setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public ListTasksResponseBodyData setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public ListTasksResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTasksResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
