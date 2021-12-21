// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToCenRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ChildInstanceAliUid")
    public Long childInstanceAliUid;

    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    @NameInMap("ChildInstanceType")
    public String childInstanceType;

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

    @NameInMap("RouteTableId")
    public String routeTableId;

    public static DeleteCenChildInstanceRouteEntryToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToCenRequest self = new DeleteCenChildInstanceRouteEntryToCenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setChildInstanceAliUid(Long childInstanceAliUid) {
        this.childInstanceAliUid = childInstanceAliUid;
        return this;
    }
    public Long getChildInstanceAliUid() {
        return this.childInstanceAliUid;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteCenChildInstanceRouteEntryToCenRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
