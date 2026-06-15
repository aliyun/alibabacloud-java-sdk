// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeRequest extends TeaModel {
    /**
     * <p>The circuit code of the physical connection, provided by the line operator.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>A client-generated token to ensure the idempotency of the request.</p>
     * <p>The token must be unique across requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new description of the physical connection.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line operator that provides the physical connection.</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The new name of the physical connection.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The peer location of the physical connection.</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The ID of the physical connection.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The port type of the physical connection.</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant physical connection.</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The ID of the region where the physical connection is located.</p>
     * <p>To get the latest list of regions, call the <code>DescribeRegions</code> operation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The client-side IP address or CIDR block in your data center.</p>
     * <p>This parameter is used only for outbound traffic shaping.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The bandwidth of the physical connection.</p>
     * <p>Unit: Mbit/s.</p>
     */
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
