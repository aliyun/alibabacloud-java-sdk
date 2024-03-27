// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("emrClusterId")
    public String emrClusterId;

    @NameInMap("endDate")
    public String endDate;

    @NameInMap("isComplementData")
    public Boolean isComplementData;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("runTimes")
    public Integer runTimes;

    @NameInMap("scheduleTime")
    public String scheduleTime;

    @NameInMap("startDate")
    public String startDate;

    @NameInMap("state")
    public String state;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("workflowId")
    public Long workflowId;

    @NameInMap("workflowVersion")
    public Integer workflowVersion;

    public static DescribeWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowInstanceResponseBody self = new DescribeWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowInstanceResponseBody setEmrClusterId(String emrClusterId) {
        this.emrClusterId = emrClusterId;
        return this;
    }
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    public DescribeWorkflowInstanceResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
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

    public DescribeWorkflowInstanceResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeWorkflowInstanceResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeWorkflowInstanceResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public DescribeWorkflowInstanceResponseBody setWorkflowVersion(Integer workflowVersion) {
        this.workflowVersion = workflowVersion;
        return this;
    }
    public Integer getWorkflowVersion() {
        return this.workflowVersion;
    }

}
