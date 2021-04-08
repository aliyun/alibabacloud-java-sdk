// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineSeatInformationRequest extends TeaModel {
    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始日期时间戳（毫秒）
    @NameInMap("StartDate")
    public Long startDate;

    // 结束日期时间戳（毫秒）
    @NameInMap("EndDate")
    public Long endDate;

    // 每页大小（默认为10)
    @NameInMap("PageSize")
    public Integer pageSize;

    // 当前页（默认为1）
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 坐席id列表
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    // 部门id列表
    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    public static GetOnlineSeatInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineSeatInformationRequest self = new GetOnlineSeatInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineSeatInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOnlineSeatInformationRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetOnlineSeatInformationRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetOnlineSeatInformationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOnlineSeatInformationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOnlineSeatInformationRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetOnlineSeatInformationRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

}
