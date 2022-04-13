// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeRequest extends TeaModel {
    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("LineOperator")
    public String lineOperator;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerLocation")
    public String peerLocation;

    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserCidr")
    public String userCidr;

    @NameInMap("bandwidth")
    public Integer bandwidth;

    public static ModifyPhysicalConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeRequest self = new ModifyPhysicalConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyPhysicalConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPhysicalConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhysicalConnectionAttributeRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public ModifyPhysicalConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPhysicalConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPhysicalConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPhysicalConnectionAttributeRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public ModifyPhysicalConnectionAttributeRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public ModifyPhysicalConnectionAttributeRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPhysicalConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyPhysicalConnectionAttributeRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public ModifyPhysicalConnectionAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

}
