// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DetachCenChildInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The ID of the network instance that you want to detach from the CEN instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
     */
    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    /**
     * <p>The ID of the region where the network instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: virtual private cloud (VPC)</p>
     * <p>*   **VBR**: virtual border router (VBR)</p>
     * <p>*   **CCN**: Cloud Connect Network (CCN) instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DetachCenChildInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCenChildInstanceRequest self = new DetachCenChildInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DetachCenChildInstanceRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DetachCenChildInstanceRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public DetachCenChildInstanceRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DetachCenChildInstanceRequest setChildInstanceOwnerId(Long childInstanceOwnerId) {
        this.childInstanceOwnerId = childInstanceOwnerId;
        return this;
    }
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    public DetachCenChildInstanceRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public DetachCenChildInstanceRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public DetachCenChildInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DetachCenChildInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachCenChildInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachCenChildInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
