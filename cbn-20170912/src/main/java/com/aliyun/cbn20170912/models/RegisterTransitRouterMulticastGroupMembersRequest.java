// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupMembersRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the multicast member is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the multicast group to which the multicast member belongs. Valid values: <strong>224.0.1.0</strong> to <strong>239.255.255.254</strong>.</p>
     * <blockquote>
     * <p>Notice: 224.0.0.0 to 224.0.0.127 are system reserved IP addresses and cannot be used as multicast group IP addresses.
     * If the multicast group that you specify does not exist in the current multicast domain, the system automatically creates a new multicast group in the current multicast domain.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239.XX.XX.2</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>The list of elastic network interfaces (ENIs) IDs.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of cross-region multicast domain IDs.</p>
     */
    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the multicast domain to which the multicast member belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-91wpg6wbhchjeq****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The instance ID of the VPC-connected instance to which the elastic network interfaces (ENIs) belongs.</p>
     * <ul>
     * <li>If the network interface controller (NIC) belongs to the same Alibaba Cloud account that you use to logon to call this operation, you do not need to set this parameter.</li>
     * <li>If the network interface controller (NIC) belongs to a different Alibaba Cloud account from the one you use to logon, you must set this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9fusm6zq8uy7cfa****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RegisterTransitRouterMulticastGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupMembersRequest self = new RegisterTransitRouterMulticastGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setPeerTransitRouterMulticastDomains(java.util.List<String> peerTransitRouterMulticastDomains) {
        this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
        return this;
    }
    public java.util.List<String> getPeerTransitRouterMulticastDomains() {
        return this.peerTransitRouterMulticastDomains;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
