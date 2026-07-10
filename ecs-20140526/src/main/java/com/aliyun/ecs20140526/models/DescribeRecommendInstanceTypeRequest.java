// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    /**
     * <p>The number of vCPUs of the ECS instance.</p>
     * <blockquote>
     * <p>If you specify both the Cores and Memory parameters, the system matches all instance types that meet the specified vCPU and memory requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The billing method of the ECS instance. For details, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <ul>
     * <li>EntryLevel: entry level.</li>
     * <li>EnterpriseLevel: enterprise level.</li>
     * <li>CreditEntryLevel: credit-based entry level. For details, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The specified instance type. For details, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>. You can also call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
     * <blockquote>
     * <p>If you specify InstanceType, you cannot specify Cores or Memory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.hfg6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Settings for the collection of alternative instance families from which alternative instance types are selected. You can specify up to 10 instance families.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.hfg6</p>
     */
    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    /**
     * <p>Specifies whether the instance is I/O optimized. If the instance type supports only non-I/O optimized instances, you cannot set the IoOptimized parameter. Valid values:</p>
     * <ul>
     * <li>optimized: I/O optimized.</li>
     * <li>none: non-I/O optimized.</li>
     * </ul>
     * <p>Default value: optimized.</p>
     * <p>If you specify a retired instance type, the default value is none.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The maximum acceptable hourly price for pay-as-you-go or spot instances.</p>
     * <blockquote>
     * <p>To set the maximum hourly price for a spot instance, set SpotStrategy to SpotWithPriceLimit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The memory size of the ECS instance. Unit: GiB.</p>
     * <blockquote>
     * <p>If you specify both the Cores and Memory parameters, the system matches all instance types that meet the specified vCPU and memory requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of the ECS instance. Valid values:</p>
     * <ul>
     * <li>vpc: virtual private cloud (VPC).</li>
     * <li>classic: classic network. The classic network is no longer available. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Discontinuation notice</a>.</li>
     * </ul>
     * <p>Default value: vpc.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority-based recommendation strategy. Valid values:</p>
     * <ul>
     * <li>InventoryFirst: inventory first.</li>
     * <li>PriceFirst: price first. Instance types are sorted by the hourly vCPU unit price in ascending order.</li>
     * <li>NewProductFirst: newest product first.</li>
     * </ul>
     * <p>Default value: InventoryFirst.</p>
     * 
     * <strong>example:</strong>
     * <p>PriceFirst</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scenario in which instance types are recommended. Valid values:</p>
     * <ul>
     * <li>UPGRADE: upgrade or downgrade an instance type.</li>
     * <li>CREATE: create an instance.</li>
     * </ul>
     * <p>Default value: CREATE.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The bidding policy for the spot instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: a spot instance with a maximum hourly price.</li>
     * <li>SpotAsPriceGo: a spot instance for which the system automatically bids at up to the pay-as-you-go price.</li>
     * </ul>
     * <blockquote>
     * <p>When you use SpotStrategy, set InstanceChargerType to PostPaid.</p>
     * </blockquote>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The category of the system disk. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: enterprise SSD (ESSD).</li>
     * <li>cloud: basic disk.</li>
     * </ul>
     * <p>Default value for non-I/O optimized instances: cloud.</p>
     * <p>Default value for I/O optimized instances: cloud_efficiency.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The zone ID. You can call <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to query the most recent zone list.</p>
     * <p>Set ZoneMatchMode to Include (default value) to preferentially recommend instance types in the zone specified by ZoneId and also list instance types in other zones within the same region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies whether to recommend only instance types in the zone specified by ZoneId. Valid values:</p>
     * <ul>
     * <li><p>Strict: recommends only instance types in the zone specified by ZoneId.</p>
     * </li>
     * <li><p>Include: recommends instance types in other zones within the same region.</p>
     * </li>
     * </ul>
     * <p>When ZoneId is specified, the default value of this parameter is Strict, which indicates that only instance types in the zone specified by ZoneId are recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>Strict</p>
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
