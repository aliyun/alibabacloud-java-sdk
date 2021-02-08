// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("VlanId")
    public Integer vlanId;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UserCidr")
    public String userCidr;

    public static ModifyVirtualBorderRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeRequest self = new ModifyVirtualBorderRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBorderRouterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ModifyVirtualBorderRouterAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
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

    public ModifyVirtualBorderRouterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVirtualBorderRouterAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyVirtualBorderRouterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVirtualBorderRouterAttributeRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

}
