// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
     * </ul>
     * 
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
     * <p>The ID of the traffic marking policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-u9nxup5kww5po8****</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    /**
     * <p>The description of the traffic classification rule.</p>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>descriptiontest</p>
     */
    @NameInMap("TrafficMatchRuleDescription")
    public String trafficMatchRuleDescription;

    /**
     * <p>The ID of the traffic classification rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-rule-fa9kgq1e90rmhc****</p>
     */
    @NameInMap("TrafficMatchRuleId")
    public String trafficMatchRuleId;

    /**
     * <p>The name of the traffic classification rule.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
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
