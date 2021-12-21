// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static WithdrawPublishedRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawPublishedRouteEntriesRequest self = new WithdrawPublishedRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawPublishedRouteEntriesRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public WithdrawPublishedRouteEntriesRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public WithdrawPublishedRouteEntriesRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public WithdrawPublishedRouteEntriesRequest setChildInstanceRouteTableId(String childInstanceRouteTableId) {
        this.childInstanceRouteTableId = childInstanceRouteTableId;
        return this;
    }
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }

    public WithdrawPublishedRouteEntriesRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public WithdrawPublishedRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public WithdrawPublishedRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public WithdrawPublishedRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
