// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentServiceStatusRequest extends TeaModel {
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetAgentServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentServiceStatusRequest self = new GetAgentServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentServiceStatusRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetAgentServiceStatusRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAgentServiceStatusRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetAgentServiceStatusRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetAgentServiceStatusRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetAgentServiceStatusRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetAgentServiceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentServiceStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAgentServiceStatusRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetAgentServiceStatusRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
