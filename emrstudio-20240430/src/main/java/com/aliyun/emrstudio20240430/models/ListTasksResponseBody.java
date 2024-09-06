// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>123abc***</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2024-03-27 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelayTime")
        public Integer delayTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailRetryInterval")
        public Integer failRetryInterval;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailRetryTimes")
        public Integer failRetryTimes;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <strong>example:</strong>
         * <p>p-3q9jo749ne5****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>r-3q9jo749ne5****</p>
         */
        @NameInMap("ResourceIds")
        public String resourceIds;

        /**
         * <strong>example:</strong>
         * <p>t-3q9jo749ne5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;yarnUser&quot;: &quot;&quot;,
         *     &quot;conditionResult&quot;: &quot;null&quot;,
         *     &quot;rawScript&quot;: &quot;sleep 300&quot;,
         *     &quot;submitOnYarnFlag&quot;: false,
         *     &quot;emrClusterId&quot;: &quot;&quot;,
         *     &quot;yarnPriority&quot;: &quot;&quot;,
         *     &quot;dependence&quot;: &quot;null&quot;,
         *     &quot;yarnMemory&quot;: &quot;&quot;,
         *     &quot;localParams&quot;: [],
         *     &quot;switchResult&quot;: &quot;null&quot;,
         *     &quot;resourceList&quot;: [],
         *     &quot;yarnQueue&quot;: &quot;&quot;,
         *     &quot;yarnVCores&quot;: &quot;&quot;,
         *     &quot;associateManualTaskFlag&quot;: false
         * }</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        @NameInMap("TaskPriority")
        public String taskPriority;

        /**
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>CLOSE</p>
         */
        @NameInMap("TimeoutFlag")
        public String timeoutFlag;

        /**
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("TimeoutNotifyStrategy")
        public String timeoutNotifyStrategy;

        /**
         * <strong>example:</strong>
         * <p>2024-03-27 00:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
