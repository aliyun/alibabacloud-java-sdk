// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgentServiceOrderSummaryVO extends TeaModel {
    @NameInMap("AgentService")
    public String agentService;

    @NameInMap("DeepResearchQuota")
    public Long deepResearchQuota;

    @NameInMap("ModelCallQuota")
    public Long modelCallQuota;

    @NameInMap("OrderCount")
    public Integer orderCount;

    @NameInMap("ServiceNumTotal")
    public Integer serviceNumTotal;

    @NameInMap("SkillPlanCallQuota")
    public Long skillPlanCallQuota;

    public static AgentServiceOrderSummaryVO build(java.util.Map<String, ?> map) throws Exception {
        AgentServiceOrderSummaryVO self = new AgentServiceOrderSummaryVO();
        return TeaModel.build(map, self);
    }

    public AgentServiceOrderSummaryVO setAgentService(String agentService) {
        this.agentService = agentService;
        return this;
    }
    public String getAgentService() {
        return this.agentService;
    }

    public AgentServiceOrderSummaryVO setDeepResearchQuota(Long deepResearchQuota) {
        this.deepResearchQuota = deepResearchQuota;
        return this;
    }
    public Long getDeepResearchQuota() {
        return this.deepResearchQuota;
    }

    public AgentServiceOrderSummaryVO setModelCallQuota(Long modelCallQuota) {
        this.modelCallQuota = modelCallQuota;
        return this;
    }
    public Long getModelCallQuota() {
        return this.modelCallQuota;
    }

    public AgentServiceOrderSummaryVO setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }
    public Integer getOrderCount() {
        return this.orderCount;
    }

    public AgentServiceOrderSummaryVO setServiceNumTotal(Integer serviceNumTotal) {
        this.serviceNumTotal = serviceNumTotal;
        return this;
    }
    public Integer getServiceNumTotal() {
        return this.serviceNumTotal;
    }

    public AgentServiceOrderSummaryVO setSkillPlanCallQuota(Long skillPlanCallQuota) {
        this.skillPlanCallQuota = skillPlanCallQuota;
        return this;
    }
    public Long getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

}
