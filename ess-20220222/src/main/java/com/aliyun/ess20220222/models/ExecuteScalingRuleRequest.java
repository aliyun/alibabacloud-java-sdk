// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExecuteScalingRuleRequest extends TeaModel {
    @NameInMap("BreachThreshold")
    public Float breachThreshold;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MetricValue")
    public Float metricValue;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingRuleAri")
    public String scalingRuleAri;

    public static ExecuteScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScalingRuleRequest self = new ExecuteScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteScalingRuleRequest setBreachThreshold(Float breachThreshold) {
        this.breachThreshold = breachThreshold;
        return this;
    }
    public Float getBreachThreshold() {
        return this.breachThreshold;
    }

    public ExecuteScalingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteScalingRuleRequest setMetricValue(Float metricValue) {
        this.metricValue = metricValue;
        return this;
    }
    public Float getMetricValue() {
        return this.metricValue;
    }

    public ExecuteScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ExecuteScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecuteScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExecuteScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExecuteScalingRuleRequest setScalingRuleAri(String scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
        return this;
    }
    public String getScalingRuleAri() {
        return this.scalingRuleAri;
    }

}
