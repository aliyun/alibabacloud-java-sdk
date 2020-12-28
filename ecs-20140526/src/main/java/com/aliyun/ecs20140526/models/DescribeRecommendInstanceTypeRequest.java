// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("InstanceBandwidthRx")
    public Integer instanceBandwidthRx;

    @NameInMap("InstanceBandwidthTx")
    public Integer instanceBandwidthTx;

    @NameInMap("InstancePpsRx")
    public Integer instancePpsRx;

    @NameInMap("InstancePpsTx")
    public Integer instancePpsTx;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    public static DescribeRecommendInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeRequest self = new DescribeRecommendInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRecommendInstanceTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRecommendInstanceTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRecommendInstanceTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRecommendInstanceTypeRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeRecommendInstanceTypeRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRecommendInstanceTypeRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeRecommendInstanceTypeRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeRecommendInstanceTypeRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeRecommendInstanceTypeRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public DescribeRecommendInstanceTypeRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceBandwidthRx(Integer instanceBandwidthRx) {
        this.instanceBandwidthRx = instanceBandwidthRx;
        return this;
    }
    public Integer getInstanceBandwidthRx() {
        return this.instanceBandwidthRx;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceBandwidthTx(Integer instanceBandwidthTx) {
        this.instanceBandwidthTx = instanceBandwidthTx;
        return this;
    }
    public Integer getInstanceBandwidthTx() {
        return this.instanceBandwidthTx;
    }

    public DescribeRecommendInstanceTypeRequest setInstancePpsRx(Integer instancePpsRx) {
        this.instancePpsRx = instancePpsRx;
        return this;
    }
    public Integer getInstancePpsRx() {
        return this.instancePpsRx;
    }

    public DescribeRecommendInstanceTypeRequest setInstancePpsTx(Integer instancePpsTx) {
        this.instancePpsTx = instancePpsTx;
        return this;
    }
    public Integer getInstancePpsTx() {
        return this.instancePpsTx;
    }

    public DescribeRecommendInstanceTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRecommendInstanceTypeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeRecommendInstanceTypeRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeRecommendInstanceTypeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceTypeFamily(java.util.List<String> instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

}
