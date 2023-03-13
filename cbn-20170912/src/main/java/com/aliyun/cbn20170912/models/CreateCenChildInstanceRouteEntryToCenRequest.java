// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToCenRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
     * <br>
     * <p>> If the network instance belongs to another Alibaba Cloud account, this parameter is required.</p>
     */
    @NameInMap("ChildInstanceAliUid")
    public Long childInstanceAliUid;

    /**
     * <p>The ID of the network instance.</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the region where the network instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: a virtual private cloud (VPC)</p>
     * <p>*   **VBR**: a virtual border router (VBR)</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <p>The destination CIDR block of the route.</p>
     * <br>
     * <p>Specify the value of this parameter in CIDR notation. Example: 192.168.10.0/24.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the route table configured on the network instance.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateCenChildInstanceRouteEntryToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToCenRequest self = new CreateCenChildInstanceRouteEntryToCenRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceAliUid(Long childInstanceAliUid) {
        this.childInstanceAliUid = childInstanceAliUid;
        return this;
    }
    public Long getChildInstanceAliUid() {
        return this.childInstanceAliUid;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
