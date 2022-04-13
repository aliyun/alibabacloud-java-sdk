// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserCidr")
    public String userCidr;

    @NameInMap("VbrId")
    public String vbrId;

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
