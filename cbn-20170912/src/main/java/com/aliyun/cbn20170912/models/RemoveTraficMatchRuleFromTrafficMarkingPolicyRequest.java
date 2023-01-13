// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. </p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The client token can contain only ASCII characters.  </p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the request. Valid values:</p>
     * <br>
     * <p>- **true**: prechecks the request but does not delete the traffic classification rules. The system checks the required parameters, the request format, and the service limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>- **false** (default): sends the request and deletes the specified traffic classification rules after the request passes the precheck.</p>
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
     * <br>
     * <p>You can specify at most 20 traffic classification rules.</p>
     * <br>
     * <p>You can call the ListTrafficMarkingPolicies operation to query the IDs of traffic classification rules in a specified traffic marking policy.</p>
     */
    @NameInMap("TrafficMarkRuleIds")
    public java.util.List<String> trafficMarkRuleIds;

    /**
     * <p>The ID of the traffic marking policy.</p>
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
