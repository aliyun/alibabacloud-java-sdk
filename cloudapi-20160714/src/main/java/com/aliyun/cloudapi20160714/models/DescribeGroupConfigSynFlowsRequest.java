// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupConfigSynFlowsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TargetGroupName")
    public String targetGroupName;

    @NameInMap("SourceGroupName")
    public String sourceGroupName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FlowStatus")
    public String flowStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeGroupConfigSynFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupConfigSynFlowsRequest self = new DescribeGroupConfigSynFlowsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupConfigSynFlowsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGroupConfigSynFlowsRequest setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    public DescribeGroupConfigSynFlowsRequest setSourceGroupName(String sourceGroupName) {
        this.sourceGroupName = sourceGroupName;
        return this;
    }
    public String getSourceGroupName() {
        return this.sourceGroupName;
    }

    public DescribeGroupConfigSynFlowsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeGroupConfigSynFlowsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeGroupConfigSynFlowsRequest setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public DescribeGroupConfigSynFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupConfigSynFlowsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
