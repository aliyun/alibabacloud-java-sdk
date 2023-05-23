// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The operation that you want to perform. Set the value to **RemoveTraficMatchRuleFromTrafficMarkingPolicy**.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TrafficMarkRuleIds")
    public java.util.List<String> trafficMarkRuleIds;

    /**
     * <p>Deletes specified traffic classification rules from a traffic marking policy.</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    public static RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest self = new RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setTrafficMarkRuleIds(java.util.List<String> trafficMarkRuleIds) {
        this.trafficMarkRuleIds = trafficMarkRuleIds;
        return this;
    }
    public java.util.List<String> getTrafficMarkRuleIds() {
        return this.trafficMarkRuleIds;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

}
