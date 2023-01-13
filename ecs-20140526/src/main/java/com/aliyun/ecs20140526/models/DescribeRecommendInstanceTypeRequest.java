// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    /**
     * <p>The number of vCPUs of the instance.</p>
     * <br>
     * <p>>  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The billing method of the instances of the instance type. For more information, see [Billing overview](~~25398~~). Valid values:</p>
     * <br>
     * <p>* PrePaid: subscription</p>
     * <p>* PostPaid: pay-as-you-go</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <br>
     * <p>* EntryLevel</p>
     * <p>* EnterpriseLevel.</p>
     * <p>* CreditEntryLevel. For more information, see [Burstable instance families](~~59977~~).</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The specified instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.</p>
     * <br>
     * <p>>  If the `InstanceType` parameter is specified, none of the `Cores` and `Memory` parameters can be specified.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Instance families to be filtered out. You can specify up to 10 instance families.</p>
     */
    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    /**
     * <p>Specifies whether to match I/O optimized instances. The IoOptimized parameter cannot be specified when the instance is not I/O optimized. Valid values:</p>
     * <br>
     * <p>* optimized: matches I/O optimized instances.</p>
     * <p>* none: matches non-I/O optimized instances.</p>
     * <br>
     * <p>Default value: optimized.</p>
     * <br>
     * <p>If you query alternative instance types for retired instance types, this parameter is set to none by default. Default value: none.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The maximum hourly price for pay-as-you-go instances or preemptible instances.</p>
     * <br>
     * <p>>  If this parameter is specified, the `SpotStrategy` parameter must be set to `SpotWithPriceLimit`.</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The memory size of the instance. Unit: GiB.</p>
     * <br>
     * <p>>  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of the ECS instance. Valid values:</p>
     * <br>
     * <p>*   classic: classic network</p>
     * <p>*   vpc: VPC</p>
     * <br>
     * <p>Default value: vpc.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy for recommending instance types. Valid values:</p>
     * <br>
     * <p>* InventoryFirst: Instance types are recommended in descending order based on resource availability.</p>
     * <p>* PriceFirst: Instance types are recommended in ascending order based on hourly price per vCPU.</p>
     * <p>* NewProductFirst: The latest instance types are recommended first.</p>
     * <br>
     * <p>Default value: InventoryFirst.</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The region ID of the alternative instance types. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies the scenario in which the instance type is recommended. Valid values:</p>
     * <br>
     * <p>* UPGRADE: instance type upgrade or downgrade</p>
     * <p>* CREATE: instance creation</p>
     * <br>
     * <p>Default value: CREATE.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The bidding policy of preemptible instances. Valid values:</p>
     * <br>
     * <p>* NoSpot: applies to regular pay-as-you-go instances.</p>
     * <p>* SpotWithPriceLimit: applies to preemptible instances that have user-defined maximum hourly prices.</p>
     * <p>* SpotAsPriceGo: applies to preemptible instances that are of the market price at the time of purchase.</p>
     * <br>
     * <p>> If the `SpotStrategy` parameter is specified, the `InstanceChargeType` parameter must be set to `PostPaid`.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The category of the system disk. Valid values:</p>
     * <br>
     * <p>* cloud_efficiency: ultra disk</p>
     * <p>* cloud_ssd: standard SSD</p>
     * <p>* cloud_essd: enhanced SSD (ESSD)</p>
     * <p>* cloud: basic disk</p>
     * <br>
     * <p>For non-I/O optimized instances, the default value is cloud.</p>
     * <br>
     * <p>For I/O optimized instances, the default value is cloud_efficiency.</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The zone ID of the alternative instance types. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>When you specify this parameter, we recommend that you set ZoneMatchMode to the default value Include. This value indicates that instance types in the zone specified by ZoneId are preferentially recommended, and instance types in other zones in the same region are also listed.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies which alternative instance types are recommended. Valid values:</p>
     * <br>
     * <p>* Strict: recommends only alternative instance types in the zone specified by ZoneId.</p>
     * <p>* Include: recommends all instance types in all the zones in the same region as the specified instance type.</p>
     * <br>
     * <p>When `ZoneId` is specified, the default value of this parameter is Strict. This value indicates that only alternative instance types in the zone specified by ZoneId are recommended.</p>
     */
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
