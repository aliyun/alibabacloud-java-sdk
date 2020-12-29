// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToCenRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    @NameInMap("ChildInstanceAliUid")
    public Long childInstanceAliUid;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    public static CreateCenChildInstanceRouteEntryToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToCenRequest self = new CreateCenChildInstanceRouteEntryToCenRequest();
        return TeaModel.build(map, self);
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

    public CreateCenChildInstanceRouteEntryToCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setChildInstanceAliUid(Long childInstanceAliUid) {
        this.childInstanceAliUid = childInstanceAliUid;
        return this;
    }
    public Long getChildInstanceAliUid() {
        return this.childInstanceAliUid;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateCenChildInstanceRouteEntryToCenRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

}
