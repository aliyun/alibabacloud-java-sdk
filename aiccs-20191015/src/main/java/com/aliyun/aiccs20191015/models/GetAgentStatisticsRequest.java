// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentStatisticsRequest extends TeaModel {
    // 坐席id列表
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    // 当前页（默认为1）
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 部门id列表
    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    // 结束日期时间戳（毫秒）
    @NameInMap("EndDate")
    public Long endDate;

    // 是否根据坐席分组
    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    // 是否根据部门分组
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 每页大小（默认为10)
    @NameInMap("PageSize")
    public Integer pageSize;

    // 开始日期时间戳（毫秒）
    @NameInMap("StartDate")
    public Long startDate;

    // 时间纬度类型
    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetAgentStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatisticsRequest self = new GetAgentStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentStatisticsRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetAgentStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAgentStatisticsRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetAgentStatisticsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetAgentStatisticsRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetAgentStatisticsRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetAgentStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAgentStatisticsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetAgentStatisticsRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
