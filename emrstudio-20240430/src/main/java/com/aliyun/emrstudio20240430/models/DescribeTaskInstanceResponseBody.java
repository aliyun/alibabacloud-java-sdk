// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeTaskInstanceResponseBody extends TeaModel {
    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("EmrClusterId")
    public String emrClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExternalAppId")
    public String externalAppId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RetryTimes")
    public Integer retryTimes;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubmitTime")
    public String submitTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskInstanceId")
    public String taskInstanceId;

    @NameInMap("TaskInstanceName")
    public String taskInstanceName;

    @NameInMap("TaskParams")
    public String taskParams;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskVersion")
    public String taskVersion;

    @NameInMap("WorkflowInstanceId")
    public String workflowInstanceId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInstanceResponseBody self = new DescribeTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInstanceResponseBody setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public DescribeTaskInstanceResponseBody setEmrClusterId(String emrClusterId) {
        this.emrClusterId = emrClusterId;
        return this;
    }
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    public DescribeTaskInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTaskInstanceResponseBody setExternalAppId(String externalAppId) {
        this.externalAppId = externalAppId;
        return this;
    }
    public String getExternalAppId() {
        return this.externalAppId;
    }

    public DescribeTaskInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTaskInstanceResponseBody setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public DescribeTaskInstanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTaskInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeTaskInstanceResponseBody setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public DescribeTaskInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskInstanceResponseBody setTaskInstanceId(String taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public DescribeTaskInstanceResponseBody setTaskInstanceName(String taskInstanceName) {
        this.taskInstanceName = taskInstanceName;
        return this;
    }
    public String getTaskInstanceName() {
        return this.taskInstanceName;
    }

    public DescribeTaskInstanceResponseBody setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public DescribeTaskInstanceResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTaskInstanceResponseBody setTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }
    public String getTaskVersion() {
        return this.taskVersion;
    }

    public DescribeTaskInstanceResponseBody setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public DescribeTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
