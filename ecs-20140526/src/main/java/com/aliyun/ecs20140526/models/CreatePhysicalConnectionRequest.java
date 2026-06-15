// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The access point ID. You can call the <code>DescribeAccessPoints</code> operation to obtain a list of available access points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The circuit code provided by the carrier.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>A client-generated token that you can use to ensure the idempotency of the request. This token must be unique across requests, contain only ASCII characters, and be no more than 64 characters long.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the physical connection. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The carrier that provides the physical connection. Valid values: <code>CT</code> (China Telecom), <code>CU</code> (China Unicom), <code>CM</code> (China Mobile), <code>CO</code> (other Chinese carriers), and <code>AL</code> (Alibaba Cloud).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The name of the physical connection. The name must be 2 to 128 characters long. It must start with a letter and can contain letters, digits, underscores (<code>_</code>), and hyphens (<code>-</code>).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The physical location of your on-premises data center.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port type of the physical connection. You cannot change this parameter after the physical connection is created. Valid values: <code>1000Base-LX</code> (1 Gbit/s), <code>10GBase-LR</code> (10 Gbit/s), and <code>40GBase-LR</code> (40 Gbit/s).</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant physical connection. The redundant physical connection must be in the <code>Allocated</code>, <code>Confirmed</code>, or <code>Enabled</code> state.</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The ID of the region for the physical connection. You can call the <code>DescribeRegions</code> operation to obtain the latest list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the physical connection. Valid values: <code>VPC</code> and <code>VBR</code>. The default value is <code>VPC</code>. This parameter is available only to whitelisted users.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The user CIDR block. This parameter is required when <code>Type</code> is set to <code>VPC</code>. The CIDR block must be a private IPv4 block. Valid CIDR blocks include the following blocks and their subnets: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, and <code>192.168.0.0/16</code>.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The bandwidth of the physical connection in Mbit/s. The value must be an integer that ranges from 1 to 10,240.</p>
     */
    @NameInMap("bandwidth")
    public Integer bandwidth;

    public static CreatePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionRequest self = new CreatePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreatePhysicalConnectionRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public CreatePhysicalConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePhysicalConnectionRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public CreatePhysicalConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePhysicalConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhysicalConnectionRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public CreatePhysicalConnectionRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreatePhysicalConnectionRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public CreatePhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePhysicalConnectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePhysicalConnectionRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public CreatePhysicalConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

}
