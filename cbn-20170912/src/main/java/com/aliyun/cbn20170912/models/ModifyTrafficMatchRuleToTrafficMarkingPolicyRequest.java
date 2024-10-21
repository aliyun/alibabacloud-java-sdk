// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-u9nxup5kww5po8****</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    /**
     * <strong>example:</strong>
     * <p>descriptiontest</p>
     */
    @NameInMap("TrafficMatchRuleDescription")
    public String trafficMatchRuleDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-rule-fa9kgq1e90rmhc****</p>
     */
    @NameInMap("TrafficMatchRuleId")
    public String trafficMatchRuleId;

    /**
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficMatchRuleName")
    public String trafficMatchRuleName;

    public static ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest self = new ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
        this.trafficMatchRuleDescription = trafficMatchRuleDescription;
        return this;
    }
    public String getTrafficMatchRuleDescription() {
        return this.trafficMatchRuleDescription;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMatchRuleId(String trafficMatchRuleId) {
        this.trafficMatchRuleId = trafficMatchRuleId;
        return this;
    }
    public String getTrafficMatchRuleId() {
        return this.trafficMatchRuleId;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMatchRuleName(String trafficMatchRuleName) {
        this.trafficMatchRuleName = trafficMatchRuleName;
        return this;
    }
    public String getTrafficMatchRuleName() {
        return this.trafficMatchRuleName;
    }

}
