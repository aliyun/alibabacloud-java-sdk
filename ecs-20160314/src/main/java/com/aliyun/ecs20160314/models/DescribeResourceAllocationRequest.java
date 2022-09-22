// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAllocationRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("DataDiskCategory")
    public java.util.List<String> dataDiskCategory;

    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypeModel")
    public java.util.List<InstanceTypeModel> instanceTypeModel;

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

    @NameInMap("PostPaidBaseCapacity")
    public Integer postPaidBaseCapacity;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpotBaseCapacity")
    public Integer spotBaseCapacity;

    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("StrictSatisfiedTargetCapacity")
    public Boolean strictSatisfiedTargetCapacity;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static DescribeResourceAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAllocationRequest self = new DescribeResourceAllocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAllocationRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeResourceAllocationRequest setDataDiskCategory(java.util.List<String> dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public java.util.List<String> getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public DescribeResourceAllocationRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public DescribeResourceAllocationRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeResourceAllocationRequest setInstanceTypeModel(java.util.List<InstanceTypeModel> instanceTypeModel) {
        this.instanceTypeModel = instanceTypeModel;
        return this;
    }
    public java.util.List<InstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    public DescribeResourceAllocationRequest setInstanceTypeSupportIPv6(Boolean instanceTypeSupportIPv6) {
        this.instanceTypeSupportIPv6 = instanceTypeSupportIPv6;
        return this;
    }
    public Boolean getInstanceTypeSupportIPv6() {
        return this.instanceTypeSupportIPv6;
    }

    public DescribeResourceAllocationRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeResourceAllocationRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeResourceAllocationRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeResourceAllocationRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeResourceAllocationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourceAllocationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceAllocationRequest setPostPaidBaseCapacity(Integer postPaidBaseCapacity) {
        this.postPaidBaseCapacity = postPaidBaseCapacity;
        return this;
    }
    public Integer getPostPaidBaseCapacity() {
        return this.postPaidBaseCapacity;
    }

    public DescribeResourceAllocationRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public DescribeResourceAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceAllocationRequest setResourceAmountType(String resourceAmountType) {
        this.resourceAmountType = resourceAmountType;
        return this;
    }
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    public DescribeResourceAllocationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceAllocationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceAllocationRequest setSpotBaseCapacity(Integer spotBaseCapacity) {
        this.spotBaseCapacity = spotBaseCapacity;
        return this;
    }
    public Integer getSpotBaseCapacity() {
        return this.spotBaseCapacity;
    }

    public DescribeResourceAllocationRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public DescribeResourceAllocationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeResourceAllocationRequest setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
        this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
        return this;
    }
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
    }

    public DescribeResourceAllocationRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeResourceAllocationRequest setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    public DescribeResourceAllocationRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class InstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

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

        public InstanceTypeModel setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public InstanceTypeModel setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
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
