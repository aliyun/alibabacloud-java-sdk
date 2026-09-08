// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesRequest extends TeaModel {
    /**
     * <p>The CEN instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-sxjfjkjfkjfiein****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The network instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-rj9gt5nll27onu7****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The region ID of the network instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The ID of the route table of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp174d1gje79u1g4t****</p>
     */
    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <p>The destination CIDR block of the route entry to withdraw.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.1.0/24</p>
     */
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
