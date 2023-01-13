// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupMembersRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: only prechecks the request but does not remove the multicast members. The system checks the required parameters, the request format, and the service limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the API request. After the request passes the precheck, the multicast members are removed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the multicast group to which the multicast members belong.</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>The IDs of the elastic network interfaces (ENI).</p>
     * <br>
     * <p>You can specify multiple ENIs. Make sure that the total number of specified ENIs and multicast domains does not exceed five.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the multicast domains that is in a different region.</p>
     * <br>
     * <p>You can specify multiple multicast domains. Make sure that the total number of specified ENIs and multicast domains does not exceed five.</p>
     */
    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the multicast domain to which the multicast members belong.</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    public static DeregisterTransitRouterMulticastGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTransitRouterMulticastGroupMembersRequest self = new DeregisterTransitRouterMulticastGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setPeerTransitRouterMulticastDomains(java.util.List<String> peerTransitRouterMulticastDomains) {
        this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
        return this;
    }
    public java.util.List<String> getPeerTransitRouterMulticastDomains() {
        return this.peerTransitRouterMulticastDomains;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeregisterTransitRouterMulticastGroupMembersRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

}
