// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupMembersRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
