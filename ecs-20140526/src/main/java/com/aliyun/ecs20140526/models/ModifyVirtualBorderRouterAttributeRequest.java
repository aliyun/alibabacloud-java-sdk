// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    /**
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by your connectivity provider.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>A client-generated token that ensures the request is idempotent. The token must be unique for each request, contain only ASCII characters, and not exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <p>The description must be 2 to 256 characters long. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The local gateway IP address for the BGP session.</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The name of the VBR.</p>
     * <p>The name must be 2 to 128 characters long. It must start with a letter and can contain letters, digits, underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The peer gateway IP address for the BGP session.</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The subnet mask for the <code>LocalGatewayIp</code> and <code>PeerGatewayIp</code>.</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The ID of the region where the virtual border router (VBR) is deployed.</p>
     * <p>To get a list of the latest regions, call the <code>DescribeRegions</code> operation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The CIDR block of the on-premises network that is connected to the VBR.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The ID of the VBR to modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The VLAN ID of the VBR. The VLAN ID must be unique on the physical connection.</p>
     * <p>Valid values: 0 to 4095.</p>
     * <p>A value of 0 indicates that the VBR does not use a VLAN.</p>
     */
    @NameInMap("VlanId")
    public Integer vlanId;

    public static ModifyVirtualBorderRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeRequest self = new ModifyVirtualBorderRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBorderRouterAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyVirtualBorderRouterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVirtualBorderRouterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public ModifyVirtualBorderRouterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVirtualBorderRouterAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Integer getVlanId() {
        return this.vlanId;
    }

}
