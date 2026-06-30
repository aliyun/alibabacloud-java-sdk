// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupSourcesRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the request ID as the client token. The request ID is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the check, a multicast source is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the multicast group to which the multicast source belongs. Valid values range from <strong>224.0.1.0</strong> to <strong>239.255.255.254</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The IP addresses from 224.0.0.0 to 224.0.0.127 are system reserved IP addresses. They cannot be used as multicast group IP addresses.</p>
     * <p>If the specified multicast group does not exist in the multicast domain, the system automatically creates the multicast group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239.XX.XX.2</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>A list of ENI IDs.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the multicast domain to which the multicast source belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-5mjb5gjb6dgu98****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The ID of the VPC to which the ENI belongs.</p>
     * <ul>
     * <li><p>If the ENI belongs to your Alibaba Cloud account, this parameter is optional.</p>
     * </li>
     * <li><p>If the ENI belongs to a different Alibaba Cloud account, this parameter is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9fusm6zq8uy7cfa****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RegisterTransitRouterMulticastGroupSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupSourcesRequest self = new RegisterTransitRouterMulticastGroupSourcesRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
