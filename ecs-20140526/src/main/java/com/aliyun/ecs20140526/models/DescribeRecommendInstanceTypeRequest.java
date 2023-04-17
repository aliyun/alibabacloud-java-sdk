// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    /**
     * <p>The number of vCPUs for the instance.</p>
     * <br>
     * <p>> If the `Cores` and `Memory` parameters are both specified, all instance types with the vCPUs and memory size specified by the parameters are queried.</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The billing method of the instance. For more information, see [Billing overview](~~25398~~). Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <br>
     * <p>*   EntryLevel.</p>
     * <p>*   EnterpriseLevel.</p>
     * <p>*   CreditEntryLevel: credit-based entry level. For more information, see [Burstable instance families](~~59977~~).</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The specified instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.</p>
     * <br>
     * <p>> If the `InstanceType` parameter is specified, the `Cores` and `Memory` are ignored.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies the instance families from which the alternative instance types are selected. You can specify up to 10 instance types.</p>
     */
    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    /**
     * <p>Indicates whether the instance is an I/O optimized instance. The IoOptimized parameter cannot be specified when the instance is not I/O optimized. Valid values:</p>
     * <br>
     * <p>*   optimized</p>
     * <p>*   none</p>
     * <br>
     * <p>Default value: optimized.</p>
     * <br>
     * <p>If you query alternative instance types for retired instance types, this parameter is set to none by default.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The maximum hourly price for pay-as-you-go instances or preemptible instances.</p>
     * <br>
     * <p>>  This parameter takes effect only when `SpotStrategy` is set to `SpotWithPriceLimit`.</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The memory size of the instance. Unit: GiB.</p>
     * <br>
     * <p>> If the `Cores` and `Memory` parameters are both specified, all instance types with the vCPUs and memory size specified by the parameters are queried.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   classic</p>
     * <p>*   vpc</p>
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
     * <p>The policy based on which the system recommends the instance type. Valid values:</p>
     * <br>
     * <p>*   InventoryFirst: Instance types are recommended in descending order based on resource availability.</p>
     * <p>*   PriceFirst: Instance types are recommended in ascending order based on hourly price per vCPU.</p>
     * <p>*   NewProductFirst: The latest instance types are recommended first.</p>
     * <br>
     * <p>Default value: InventoryFirst.</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies the scenarios in which the instance type is recommended. Valid values:</p>
     * <br>
     * <p>*   UPGRADE: instance type upgrade or downgrade</p>
     * <p>*   CREATE: instance creation</p>
     * <br>
     * <p>Default value: CREATE.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The bidding policy of preemptible instances. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be as high as the pay-as-you-go price.</p>
     * <br>
     * <p>> The `SpotStrategy` parameter takes effect only when `InstanceChargeType` is set to `PostPaid`.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <p>*   cloud_ssd: SSD</p>
     * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
     * <p>*   cloud: basic disk</p>
     * <br>
     * <p>For non-I/O optimized instances, the default value is cloud.</p>
     * <br>
     * <p>For I/O optimized instances, the default value is cloud_efficiency.</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The ID of the zone for which to query resources. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>We recommend that you set the value of ZoneMatchMode to Include, which is the default value. As a result, instance types within zones specified by ZoneId are recommended with priority. Instance types in other zones within the same region are also listed.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies whether to recommend only instance types in the zone specified by ZoneId. Valid values:</p>
     * <br>
     * <p>*   Strict: only instance types within zones specified by the ZoneId parameter are recommended.</p>
     * <p>*   Include: instance types in other zones within the same region are also recommended.</p>
     * <br>
     * <p>If `ZoneId` is specified, the default value of this parameter is Strict. This value indicates that only alternative instance types in the zone specified by ZoneId are recommended.</p>
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
