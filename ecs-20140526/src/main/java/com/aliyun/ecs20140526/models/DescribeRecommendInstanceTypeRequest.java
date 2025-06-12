// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    /**
     * <p>The number of vCPU cores of the instance type.</p>
     * <blockquote>
     * <p> If you specify both <code>Cores</code> and <code>Memory</code>, the system returns all instance types that match the values of the parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The billing method of ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
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
     * <li>CreditEntryLevel: credit-based entry level. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instance families</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
     * <blockquote>
     * <p> If you specify <code>InstanceType</code>, you cannot specify <code>Cores</code> or <code>Memory</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.hfg6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance families from which the alternative instance types are selected. You can specify up to 10 instance families.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.hfg6</p>
     */
    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    /**
     * <p>Specifies whether instances of the instance type are I/O optimized. You cannot specify IoOptimized if the instance type supports only non-I/O optimized instances. Valid values:</p>
     * <ul>
     * <li>optimized: The instances are I/O optimized.</li>
     * <li>none: The instances are non-I/O optimized.</li>
     * </ul>
     * <p>Default value: optimized.</p>
     * <p>If you query alternative instance types for retired instance types, this parameter is set to none by default.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The maximum hourly price for pay-as-you-go instances or spot instances.</p>
     * <blockquote>
     * <p> This parameter takes effect only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The memory size of the instance type. Unit: GiB.</p>
     * <blockquote>
     * <p> If you specify both <code>Cores</code> and <code>Memory</code>, the system returns all instance types that match the values of the parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of ECS instances. Valid values:</p>
     * <ul>
     * <li>classic</li>
     * <li>vpc</li>
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
     * <p>The policy that is used to recommend instance types. Valid values:</p>
     * <ul>
     * <li>InventoryFirst: recommends instance types in descending order of resource availability.</li>
     * <li>PriceFirst: recommends the most cost-effective instance types. Recommended instance types appear based on the hourly prices of vCPUs in ascending order.</li>
     * <li>NewProductFirst: recommends the latest instance types.</li>
     * </ul>
     * <p>Default value: InventoryFirst.</p>
     * 
     * <strong>example:</strong>
     * <p>PriceFirst</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li>UPGRADE: instance type upgrade or downgrade</li>
     * <li>CREATE: instance creation</li>
     * </ul>
     * <p>Default value: CREATE.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The bidding policy of spot instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are created as spot instances for which you can specify the maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instances are spot instances for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify <code>SpotStrategy</code>, you must set <code>InstanceChargeType</code> to <code>PostPaid</code>.</p>
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
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: Enterprise SSD (ESSD)</li>
     * <li>cloud: basic disk</li>
     * </ul>
     * <p>For non-I/O optimized instances, the default value is cloud.</p>
     * <p>For I/O optimized instances, the default value is cloud_efficiency.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * <p>We recommend that you set ZoneMatchMode to Include, which is the default value. This way, the system recommends instance types that are available in the zone specified by ZoneId based on the priority policy. The system also recommends instance types that are available in other zones within the same region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies whether to recommend only instance types in the zone specified by ZoneId. Valid values:</p>
     * <ul>
     * <li>Strict: recommends only instance types that are available in the zone specified by ZoneId.</li>
     * <li>Include: recommends instance types that are available in the zone specified by ZoneId and instance types that are available in other zones within the same region.</li>
     * </ul>
     * <p>If <code>ZoneId</code> is specified, the default value of this parameter is Strict, which indicates that only instance types in the zone specified by ZoneId are recommended.</p>
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
