// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class PublishRouteEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the associated network (VPC or VBR).</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the region to which the associated VBR or VPC belongs.</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The route table ID of the associated VBR or VPC.</p>
     */
    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    /**
     * <p>The type of the associated network. Valid values: **VPC | VBR**</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <p>The destination CIDR block of the route entry to publish.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static PublishRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRouteEntriesRequest self = new PublishRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public PublishRouteEntriesRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public PublishRouteEntriesRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public PublishRouteEntriesRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public PublishRouteEntriesRequest setChildInstanceRouteTableId(String childInstanceRouteTableId) {
        this.childInstanceRouteTableId = childInstanceRouteTableId;
        return this;
    }
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }

    public PublishRouteEntriesRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public PublishRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public PublishRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PublishRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
