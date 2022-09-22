// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceSolutionsRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypeModel")
    public java.util.List<InstanceTypeModel> instanceTypeModel;

    @NameInMap("InstanceTypeSupportIPv6")
    public Boolean instanceTypeSupportIPv6;

    @NameInMap("MatchOpenInstances")
    public Boolean matchOpenInstances;

    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static DescribeResourceSolutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSolutionsRequest self = new DescribeResourceSolutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSolutionsRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeResourceSolutionsRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeResourceSolutionsRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeResourceSolutionsRequest setInstanceTypeModel(java.util.List<InstanceTypeModel> instanceTypeModel) {
        this.instanceTypeModel = instanceTypeModel;
        return this;
    }
    public java.util.List<InstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    public DescribeResourceSolutionsRequest setInstanceTypeSupportIPv6(Boolean instanceTypeSupportIPv6) {
        this.instanceTypeSupportIPv6 = instanceTypeSupportIPv6;
        return this;
    }
    public Boolean getInstanceTypeSupportIPv6() {
        return this.instanceTypeSupportIPv6;
    }

    public DescribeResourceSolutionsRequest setMatchOpenInstances(Boolean matchOpenInstances) {
        this.matchOpenInstances = matchOpenInstances;
        return this;
    }
    public Boolean getMatchOpenInstances() {
        return this.matchOpenInstances;
    }

    public DescribeResourceSolutionsRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeResourceSolutionsRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeResourceSolutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourceSolutionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceSolutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceSolutionsRequest setResourceAmountType(String resourceAmountType) {
        this.resourceAmountType = resourceAmountType;
        return this;
    }
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    public DescribeResourceSolutionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceSolutionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceSolutionsRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeResourceSolutionsRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeResourceSolutionsRequest setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    public DescribeResourceSolutionsRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class InstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Float weightedCapacity;

        public static InstanceTypeModel build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeModel self = new InstanceTypeModel();
            return TeaModel.build(map, self);
        }

        public InstanceTypeModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstanceTypeModel setWeightedCapacity(Float weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Float getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
