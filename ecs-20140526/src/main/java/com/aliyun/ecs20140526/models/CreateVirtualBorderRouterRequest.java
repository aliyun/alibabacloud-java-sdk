// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterRequest extends TeaModel {
    /**
     * <p>The circuit code of the physical connection. This code is provided by your connectivity provider.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>A client token to ensure that the request is idempotent.</p>
     * <p>You can generate this token on your client, but you must ensure that it is unique for each request. The token can contain only ASCII characters and cannot be longer than 64 characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <p>The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IP address of the VBR gateway in Alibaba Cloud.</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The name of the VBR.</p>
     * <p>The name must be 2 to 128 characters long, start with a letter, and can contain only letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address of the gateway in your on-premises data center.</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The peering subnet mask for the IP addresses of the local gateway and the peer gateway.</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The ID of the physical connection.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The ID of the region where the Virtual Border Router (VBR) is located.</p>
     * <p>You can call the <code>DescribeRegions</code> operation to get the latest list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The CIDR block of your on-premises network. Required when the VBR is connected to a Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the VBR. Specify this parameter when creating a VBR for another account.</p>
     */
    @NameInMap("VbrOwnerId")
    public Long vbrOwnerId;

    /**
     * <p>The VLAN ID of the VBR.</p>
     * <p>Valid values: 0 to 4095.</p>
     * <p>A value of 0 indicates that the VBR is connected to the physical connection in Layer 3 router mode.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VlanId")
    public Integer vlanId;

    public static CreateVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterRequest self = new CreateVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public CreateVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVirtualBorderRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVirtualBorderRouterRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public CreateVirtualBorderRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVirtualBorderRouterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVirtualBorderRouterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVirtualBorderRouterRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public CreateVirtualBorderRouterRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public CreateVirtualBorderRouterRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreateVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualBorderRouterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVirtualBorderRouterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVirtualBorderRouterRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public CreateVirtualBorderRouterRequest setVbrOwnerId(Long vbrOwnerId) {
        this.vbrOwnerId = vbrOwnerId;
        return this;
    }
    public Long getVbrOwnerId() {
        return this.vbrOwnerId;
    }

    public CreateVirtualBorderRouterRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Integer getVlanId() {
        return this.vlanId;
    }

}
