// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    // The number of vCPUs of the instance.
    // 
    // >  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.
    @NameInMap("Cores")
    public Integer cores;

    // The billing method of the instances of the instance type. For more information, see [Billing overview](~~25398~~). Valid values:
    // 
    // * PrePaid: subscription
    // * PostPaid: pay-as-you-go
    // 
    // Default value: PostPaid.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The level of the instance family. Valid values:
    // 
    // * EntryLevel
    // * EnterpriseLevel.
    // * CreditEntryLevel. For more information, see [Burstable instance families](~~59977~~).
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    // The specified instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
    // 
    // >  If the `InstanceType` parameter is specified, none of the `Cores` and `Memory` parameters can be specified.
    @NameInMap("InstanceType")
    public String instanceType;

    // Instance families to be filtered out. You can specify up to 10 instance families.
    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    // Specifies whether to match I/O optimized instances. The IoOptimized parameter cannot be specified when the instance is not I/O optimized. Valid values:
    // 
    // * optimized: matches I/O optimized instances.
    // * none: matches non-I/O optimized instances.
    // 
    // Default value: optimized.
    // 
    // If you query alternative instance types for retired instance types, this parameter is set to none by default. Default value: none.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // The maximum hourly price for pay-as-you-go instances or preemptible instances.
    // 
    // >  If this parameter is specified, the `SpotStrategy` parameter must be set to `SpotWithPriceLimit`.
    @NameInMap("MaxPrice")
    public Float maxPrice;

    // The memory size of the instance. Unit: GiB.
    // 
    // >  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.
    @NameInMap("Memory")
    public Float memory;

    // The network type of the ECS instance. Valid values:
    // 
    // *   classic: classic network
    // *   vpc: VPC
    // 
    // Default value: vpc.
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The policy for recommending instance types. Valid values:
    // 
    // * InventoryFirst: Instance types are recommended in descending order based on resource availability.
    // * PriceFirst: Instance types are recommended in ascending order based on hourly price per vCPU.
    // * NewProductFirst: The latest instance types are recommended first.
    // 
    // Default value: InventoryFirst.
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    // The region ID of the alternative instance types. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies the scenario in which the instance type is recommended. Valid values:
    // 
    // * UPGRADE: instance type upgrade or downgrade
    // * CREATE: instance creation
    // 
    // Default value: CREATE.
    @NameInMap("Scene")
    public String scene;

    // The bidding policy of preemptible instances. Valid values:
    // 
    // * NoSpot: applies to regular pay-as-you-go instances.
    // * SpotWithPriceLimit: applies to preemptible instances that have user-defined maximum hourly prices.
    // * SpotAsPriceGo: applies to preemptible instances that are of the market price at the time of purchase.
    // 
    // > If the `SpotStrategy` parameter is specified, the `InstanceChargeType` parameter must be set to `PostPaid`.
    // 
    // Default value: NoSpot.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The category of the system disk. Valid values:
    // 
    // * cloud_efficiency: ultra disk
    // * cloud_ssd: standard SSD
    // * cloud_essd: enhanced SSD (ESSD)
    // * cloud: basic disk
    // 
    // For non-I/O optimized instances, the default value is cloud.
    // 
    // For I/O optimized instances, the default value is cloud_efficiency.
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    // The zone ID of the alternative instance types. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    // 
    // When you specify this parameter, we recommend that you set ZoneMatchMode to the default value Include. This value indicates that instance types in the zone specified by ZoneId are preferentially recommended, and instance types in other zones in the same region are also listed.
    @NameInMap("ZoneId")
    public String zoneId;

    // Specifies which alternative instance types are recommended. Valid values:
    // 
    // * Strict: recommends only alternative instance types in the zone specified by ZoneId.
    // * Include: recommends all instance types in all the zones in the same region as the specified instance type.
    // 
    // When `ZoneId` is specified, the default value of this parameter is Strict. This value indicates that only alternative instance types in the zone specified by ZoneId are recommended.
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
