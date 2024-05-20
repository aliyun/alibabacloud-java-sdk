// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("alertGroupId")
    public String alertGroupId;

    @NameInMap("alertStrategy")
    public String alertStrategy;

    @NameInMap("emrClusterId")
    public String emrClusterId;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("failureStrategy")
    public String failureStrategy;

    @NameInMap("isComplementData")
    public Boolean isComplementData;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("restartTime")
    public String restartTime;

    @NameInMap("runTimes")
    public Integer runTimes;

    @NameInMap("scheduleTime")
    public String scheduleTime;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("status")
    public String status;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("workflowId")
    public String workflowId;

    @NameInMap("workflowInstanceId")
    public String workflowInstanceId;

    @NameInMap("workflowInstancePriority")
    public String workflowInstancePriority;

    @NameInMap("workflowVersion")
    public Integer workflowVersion;

    public static DescribeWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowInstanceResponseBody self = new DescribeWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowInstanceResponseBody setAlertGroupId(String alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    public DescribeWorkflowInstanceResponseBody setAlertStrategy(String alertStrategy) {
        this.alertStrategy = alertStrategy;
        return this;
    }
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    public DescribeWorkflowInstanceResponseBody setEmrClusterId(String emrClusterId) {
        this.emrClusterId = emrClusterId;
        return this;
    }
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    public DescribeWorkflowInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeWorkflowInstanceResponseBody setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public DescribeWorkflowInstanceResponseBody setIsComplementData(Boolean isComplementData) {
        this.isComplementData = isComplementData;
        return this;
    }
    public Boolean getIsComplementData() {
        return this.isComplementData;
    }

    public DescribeWorkflowInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkflowInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeWorkflowInstanceResponseBody setRestartTime(String restartTime) {
        this.restartTime = restartTime;
        return this;
    }
    public String getRestartTime() {
        return this.restartTime;
    }

    public DescribeWorkflowInstanceResponseBody setRunTimes(Integer runTimes) {
        this.runTimes = runTimes;
        return this;
    }
    public Integer getRunTimes() {
        return this.runTimes;
    }

    public DescribeWorkflowInstanceResponseBody setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public DescribeWorkflowInstanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeWorkflowInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeWorkflowInstanceResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowInstancePriority(String workflowInstancePriority) {
        this.workflowInstancePriority = workflowInstancePriority;
        return this;
    }
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowVersion(Integer workflowVersion) {
        this.workflowVersion = workflowVersion;
        return this;
    }
    public Integer getWorkflowVersion() {
        return this.workflowVersion;
    }

}
