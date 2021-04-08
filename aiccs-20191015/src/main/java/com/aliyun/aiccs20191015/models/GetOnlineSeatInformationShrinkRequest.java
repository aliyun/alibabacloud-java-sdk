// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineSeatInformationShrinkRequest extends TeaModel {
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
    public String agentIdsShrink;

    // 部门id列表
    @NameInMap("DepIds")
    public String depIdsShrink;

    public static GetOnlineSeatInformationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineSeatInformationShrinkRequest self = new GetOnlineSeatInformationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineSeatInformationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOnlineSeatInformationShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetOnlineSeatInformationShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetOnlineSeatInformationShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOnlineSeatInformationShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOnlineSeatInformationShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public GetOnlineSeatInformationShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

}
