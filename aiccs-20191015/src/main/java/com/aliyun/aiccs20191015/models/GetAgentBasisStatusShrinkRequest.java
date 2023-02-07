// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentBasisStatusShrinkRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepIds")
    public String depIdsShrink;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    public static GetAgentBasisStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBasisStatusShrinkRequest self = new GetAgentBasisStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentBasisStatusShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public GetAgentBasisStatusShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAgentBasisStatusShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetAgentBasisStatusShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetAgentBasisStatusShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentBasisStatusShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAgentBasisStatusShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
