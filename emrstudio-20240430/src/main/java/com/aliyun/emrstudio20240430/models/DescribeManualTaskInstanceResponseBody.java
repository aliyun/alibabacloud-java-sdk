// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskInstanceResponseBody extends TeaModel {
    @NameInMap("EmrClusterId")
    public String emrClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExternalAppId")
    public String externalAppId;

    @NameInMap("ManualTaskInstanceId")
    public String manualTaskInstanceId;

    @NameInMap("ManualTaskInstanceName")
    public String manualTaskInstanceName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubmitTime")
    public String submitTime;

    @NameInMap("TaskParams")
    public String taskParams;

    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeManualTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskInstanceResponseBody self = new DescribeManualTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskInstanceResponseBody setEmrClusterId(String emrClusterId) {
        this.emrClusterId = emrClusterId;
        return this;
    }
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    public DescribeManualTaskInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeManualTaskInstanceResponseBody setExternalAppId(String externalAppId) {
        this.externalAppId = externalAppId;
        return this;
    }
    public String getExternalAppId() {
        return this.externalAppId;
    }

    public DescribeManualTaskInstanceResponseBody setManualTaskInstanceId(String manualTaskInstanceId) {
        this.manualTaskInstanceId = manualTaskInstanceId;
        return this;
    }
    public String getManualTaskInstanceId() {
        return this.manualTaskInstanceId;
    }

    public DescribeManualTaskInstanceResponseBody setManualTaskInstanceName(String manualTaskInstanceName) {
        this.manualTaskInstanceName = manualTaskInstanceName;
        return this;
    }
    public String getManualTaskInstanceName() {
        return this.manualTaskInstanceName;
    }

    public DescribeManualTaskInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeManualTaskInstanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeManualTaskInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeManualTaskInstanceResponseBody setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public DescribeManualTaskInstanceResponseBody setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public DescribeManualTaskInstanceResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeManualTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
