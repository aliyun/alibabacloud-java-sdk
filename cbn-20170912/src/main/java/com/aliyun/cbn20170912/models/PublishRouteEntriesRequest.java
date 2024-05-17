// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class PublishRouteEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the network instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the region where the network instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](https://help.aliyun.com/document_detail/132080.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The ID of the route table configured on the network instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: VPC</p>
     * <p>*   **VBR**: VBR</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <p>The destination CIDR block of the route that you want to advertise.</p>
     * <br>
     * <p>This parameter is required.</p>
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
