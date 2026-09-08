// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions without deleting the traffic classification rule from the traffic marking policy. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs the actual request. After the check passes, the traffic classification rule is directly deleted from the traffic marking policy.</li>
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
     * <p>The IDs of the traffic classification rules.</p>
     */
    @NameInMap("TrafficMarkRuleIds")
    public java.util.List<String> trafficMarkRuleIds;

    /**
     * <p>The ID of the traffic marking policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-d33hdczo3qo8ta****</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    public static RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest self = new RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setTrafficMarkRuleIds(java.util.List<String> trafficMarkRuleIds) {
        this.trafficMarkRuleIds = trafficMarkRuleIds;
        return this;
    }
    public java.util.List<String> getTrafficMarkRuleIds() {
        return this.trafficMarkRuleIds;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

}
