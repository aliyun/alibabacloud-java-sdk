// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
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

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskResponseBody self = new DescribeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeTaskResponseBody setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public DescribeTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeTaskResponseBody setFailRetryInterval(Integer failRetryInterval) {
        this.failRetryInterval = failRetryInterval;
        return this;
    }
    public Integer getFailRetryInterval() {
        return this.failRetryInterval;
    }

    public DescribeTaskResponseBody setFailRetryTimes(Integer failRetryTimes) {
        this.failRetryTimes = failRetryTimes;
        return this;
    }
    public Integer getFailRetryTimes() {
        return this.failRetryTimes;
    }

    public DescribeTaskResponseBody setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public DescribeTaskResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeTaskResponseBody setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public DescribeTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeTaskResponseBody setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public DescribeTaskResponseBody setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
        return this;
    }
    public String getTaskPriority() {
        return this.taskPriority;
    }

    public DescribeTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTaskResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeTaskResponseBody setTimeoutFlag(String timeoutFlag) {
        this.timeoutFlag = timeoutFlag;
        return this;
    }
    public String getTimeoutFlag() {
        return this.timeoutFlag;
    }

    public DescribeTaskResponseBody setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
        this.timeoutNotifyStrategy = timeoutNotifyStrategy;
        return this;
    }
    public String getTimeoutNotifyStrategy() {
        return this.timeoutNotifyStrategy;
    }

    public DescribeTaskResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeTaskResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
