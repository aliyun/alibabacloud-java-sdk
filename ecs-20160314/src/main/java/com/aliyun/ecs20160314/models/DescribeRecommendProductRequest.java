// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeRecommendProductRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

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

    @NameInMap("InstanceTypeSupportIPv6")
    public Boolean instanceTypeSupportIPv6;

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

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneMatchMode")
    public String zoneMatchMode;

    public static DescribeRecommendProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendProductRequest self = new DescribeRecommendProductRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendProductRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribeRecommendProductRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeRecommendProductRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeRecommendProductRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeRecommendProductRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRecommendProductRequest setInstanceTypeFamily(java.util.List<String> instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeRecommendProductRequest setInstanceTypeSupportIPv6(Boolean instanceTypeSupportIPv6) {
        this.instanceTypeSupportIPv6 = instanceTypeSupportIPv6;
        return this;
    }
    public Boolean getInstanceTypeSupportIPv6() {
        return this.instanceTypeSupportIPv6;
    }

    public DescribeRecommendProductRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeRecommendProductRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeRecommendProductRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeRecommendProductRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeRecommendProductRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRecommendProductRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRecommendProductRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public DescribeRecommendProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRecommendProductRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRecommendProductRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRecommendProductRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeRecommendProductRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeRecommendProductRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeRecommendProductRequest setZoneMatchMode(String zoneMatchMode) {
        this.zoneMatchMode = zoneMatchMode;
        return this;
    }
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
    }

}
