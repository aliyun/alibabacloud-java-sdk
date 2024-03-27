// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
    /**
     * <p>代表创建时间的资源属性字段</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>延时执行时间</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>失败重试间隔</p>
     */
    @NameInMap("FailRetryInterval")
    public Integer failRetryInterval;

    /**
     * <p>失败重试次数</p>
     */
    @NameInMap("FailRetryTimes")
    public Integer failRetryTimes;

    /**
     * <p>运行标志</p>
     */
    @NameInMap("Flag")
    public String flag;

    /**
     * <p>项目ID</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>资源ID列表</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>代表资源名称的资源属性字段</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>任务参数</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>任务优先级</p>
     */
    @NameInMap("TaskPriority")
    public String taskPriority;

    /**
     * <p>任务类型</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>超时时长</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>超时告警标志</p>
     */
    @NameInMap("TimeoutFlag")
    public String timeoutFlag;

    /**
     * <p>超时告警标志</p>
     */
    @NameInMap("TimeoutNotifyStrategy")
    public String timeoutNotifyStrategy;

    /**
     * <p>更新时间</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>版本</p>
     */
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
