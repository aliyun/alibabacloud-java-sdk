// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneMatchMode")
    public String zoneMatchMode;

    public static DescribeRecommendInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeRequest self = new DescribeRecommendInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeRecommendInstanceTypeRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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

    public DescribeRecommendInstanceTypeRequest setInstanceTypeFamily(java.util.List<String> instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeRecommendInstanceTypeRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeRecommendInstanceTypeRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeRecommendInstanceTypeRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeRecommendInstanceTypeRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeRecommendInstanceTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRecommendInstanceTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRecommendInstanceTypeRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public DescribeRecommendInstanceTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeRecommendInstanceTypeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeRecommendInstanceTypeRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeRecommendInstanceTypeRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeRecommendInstanceTypeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeRecommendInstanceTypeRequest setZoneMatchMode(String zoneMatchMode) {
        this.zoneMatchMode = zoneMatchMode;
        return this;
    }
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
    }

}
