// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DataAgentBillingInstance extends TeaModel {
    @NameInMap("AgentSeats")
    public Integer agentSeats;

    @NameInMap("BillingInstanceId")
    public String billingInstanceId;

    @NameInMap("BoundWorkspaceIds")
    public java.util.List<String> boundWorkspaceIds;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("FreeAgentSeats")
    public Integer freeAgentSeats;

    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("LLM")
    public Integer LLM;

    @NameInMap("PayLevel")
    public String payLevel;

    @NameInMap("SessionAvailableDurationQuota")
    public Integer sessionAvailableDurationQuota;

    @NameInMap("SessionSeats")
    public Integer sessionSeats;

    @NameInMap("TokenLimit")
    public Integer tokenLimit;

    public static DataAgentBillingInstance build(java.util.Map<String, ?> map) throws Exception {
        DataAgentBillingInstance self = new DataAgentBillingInstance();
        return TeaModel.build(map, self);
    }

    public DataAgentBillingInstance setAgentSeats(Integer agentSeats) {
        this.agentSeats = agentSeats;
        return this;
    }
    public Integer getAgentSeats() {
        return this.agentSeats;
    }

    public DataAgentBillingInstance setBillingInstanceId(String billingInstanceId) {
        this.billingInstanceId = billingInstanceId;
        return this;
    }
    public String getBillingInstanceId() {
        return this.billingInstanceId;
    }

    public DataAgentBillingInstance setBoundWorkspaceIds(java.util.List<String> boundWorkspaceIds) {
        this.boundWorkspaceIds = boundWorkspaceIds;
        return this;
    }
    public java.util.List<String> getBoundWorkspaceIds() {
        return this.boundWorkspaceIds;
    }

    public DataAgentBillingInstance setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DataAgentBillingInstance setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DataAgentBillingInstance setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DataAgentBillingInstance setFreeAgentSeats(Integer freeAgentSeats) {
        this.freeAgentSeats = freeAgentSeats;
        return this;
    }
    public Integer getFreeAgentSeats() {
        return this.freeAgentSeats;
    }

    public DataAgentBillingInstance setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public DataAgentBillingInstance setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DataAgentBillingInstance setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DataAgentBillingInstance setLLM(Integer LLM) {
        this.LLM = LLM;
        return this;
    }
    public Integer getLLM() {
        return this.LLM;
    }

    public DataAgentBillingInstance setPayLevel(String payLevel) {
        this.payLevel = payLevel;
        return this;
    }
    public String getPayLevel() {
        return this.payLevel;
    }

    public DataAgentBillingInstance setSessionAvailableDurationQuota(Integer sessionAvailableDurationQuota) {
        this.sessionAvailableDurationQuota = sessionAvailableDurationQuota;
        return this;
    }
    public Integer getSessionAvailableDurationQuota() {
        return this.sessionAvailableDurationQuota;
    }

    public DataAgentBillingInstance setSessionSeats(Integer sessionSeats) {
        this.sessionSeats = sessionSeats;
        return this;
    }
    public Integer getSessionSeats() {
        return this.sessionSeats;
    }

    public DataAgentBillingInstance setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
        return this;
    }
    public Integer getTokenLimit() {
        return this.tokenLimit;
    }

}
