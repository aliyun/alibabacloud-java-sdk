// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgentServiceOrderVO extends TeaModel {
    /**
     * <p>The agent service.</p>
     */
    @NameInMap("AgentService")
    public String agentService;

    /**
     * <p>The deep research quota.</p>
     */
    @NameInMap("DeepResearchQuota")
    public Integer deepResearchQuota;

    /**
     * <p>The quantity of deep research used.</p>
     */
    @NameInMap("DeepResearchUsed")
    public Integer deepResearchUsed;

    /**
     * <p>The service expiration time, specified in UTC.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The order creation time, specified in UTC.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The order modification time, specified in UTC.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The model call quota.</p>
     */
    @NameInMap("ModelCallQuota")
    public Integer modelCallQuota;

    /**
     * <p>The number of model calls used.</p>
     */
    @NameInMap("ModelCallUsed")
    public Integer modelCallUsed;

    /**
     * <p>The order instance ID.</p>
     */
    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    /**
     * <p>The number of services.</p>
     */
    @NameInMap("ServiceNum")
    public Integer serviceNum;

    /**
     * <p>The skill plan call quota.</p>
     */
    @NameInMap("SkillPlanCallQuota")
    public Integer skillPlanCallQuota;

    /**
     * <p>The number of skill plan calls used.</p>
     */
    @NameInMap("SkillPlanCallUsed")
    public Integer skillPlanCallUsed;

    /**
     * <p>The order status.</p>
     */
    @NameInMap("Status")
    public String status;

    public static AgentServiceOrderVO build(java.util.Map<String, ?> map) throws Exception {
        AgentServiceOrderVO self = new AgentServiceOrderVO();
        return TeaModel.build(map, self);
    }

    public AgentServiceOrderVO setAgentService(String agentService) {
        this.agentService = agentService;
        return this;
    }
    public String getAgentService() {
        return this.agentService;
    }

    public AgentServiceOrderVO setDeepResearchQuota(Integer deepResearchQuota) {
        this.deepResearchQuota = deepResearchQuota;
        return this;
    }
    public Integer getDeepResearchQuota() {
        return this.deepResearchQuota;
    }

    public AgentServiceOrderVO setDeepResearchUsed(Integer deepResearchUsed) {
        this.deepResearchUsed = deepResearchUsed;
        return this;
    }
    public Integer getDeepResearchUsed() {
        return this.deepResearchUsed;
    }

    public AgentServiceOrderVO setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public AgentServiceOrderVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentServiceOrderVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AgentServiceOrderVO setModelCallQuota(Integer modelCallQuota) {
        this.modelCallQuota = modelCallQuota;
        return this;
    }
    public Integer getModelCallQuota() {
        return this.modelCallQuota;
    }

    public AgentServiceOrderVO setModelCallUsed(Integer modelCallUsed) {
        this.modelCallUsed = modelCallUsed;
        return this;
    }
    public Integer getModelCallUsed() {
        return this.modelCallUsed;
    }

    public AgentServiceOrderVO setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public AgentServiceOrderVO setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
        return this;
    }
    public Integer getServiceNum() {
        return this.serviceNum;
    }

    public AgentServiceOrderVO setSkillPlanCallQuota(Integer skillPlanCallQuota) {
        this.skillPlanCallQuota = skillPlanCallQuota;
        return this;
    }
    public Integer getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

    public AgentServiceOrderVO setSkillPlanCallUsed(Integer skillPlanCallUsed) {
        this.skillPlanCallUsed = skillPlanCallUsed;
        return this;
    }
    public Integer getSkillPlanCallUsed() {
        return this.skillPlanCallUsed;
    }

    public AgentServiceOrderVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
