// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag-n72kong0832****</p>
     */
    @NameInMap("alertGroupId")
    public String alertGroupId;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("alertStrategy")
    public String alertStrategy;

    /**
     * <strong>example:</strong>
     * <p>c-047fa6bbe732****</p>
     */
    @NameInMap("emrClusterId")
    public String emrClusterId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>END</p>
     */
    @NameInMap("failureStrategy")
    public String failureStrategy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isComplementData")
    public Boolean isComplementData;

    /**
     * <strong>example:</strong>
     * <p>workflow_instance_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>wg-susqimrr649x****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("restartTime")
    public String restartTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runTimes")
    public Integer runTimes;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("scheduleTime")
    public String scheduleTime;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <strong>example:</strong>
     * <p>w-3q9jo749ne5****</p>
     */
    @NameInMap("workflowId")
    public String workflowId;

    /**
     * <strong>example:</strong>
     * <p>wi-3q9jo749ne5****</p>
     */
    @NameInMap("workflowInstanceId")
    public String workflowInstanceId;

    /**
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("workflowInstancePriority")
    public String workflowInstancePriority;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
