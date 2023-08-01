// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationRequest extends TeaModel {
    /**
     * <p>The preemption policy for the preemptible or pay-as-you-go instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is a regular pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance with user-defined maximum hourly prices.</p>
     * <p>*   SpotAsPriceGo: The system automatically offers a bid, which is not higher than the pay-as-you-go price for the same instance type.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     * <br>
     * <p>>  This parameter takes effect only when the InstanceChargeType parameter is set to PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>Specifies the operation for which to query the maximum public bandwidth. Valid values:</p>
     * <br>
     * <p>*   Upgrade: upgrades the public bandwidth.</p>
     * <p>*   Downgrade: downgrades the public bandwidth.</p>
     * <p>*   Create: creates an ECS instance.</p>
     * <br>
     * <p>Default value: Create.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>PrePaid</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>>  This parameter is required when the OperationType parameter is set to Upgrade or Downgrade.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    public static DescribeBandwidthLimitationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationRequest self = new DescribeBandwidthLimitationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthLimitationRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeBandwidthLimitationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeBandwidthLimitationRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeBandwidthLimitationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeBandwidthLimitationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeBandwidthLimitationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBandwidthLimitationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeBandwidthLimitationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeBandwidthLimitationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeBandwidthLimitationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

}
