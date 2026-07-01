// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceRequestDataDisk> dataDisk;

    @NameInMap("SchedulerOptions")
    public DescribePriceRequestSchedulerOptions schedulerOptions;

    @NameInMap("SystemDisk")
    public DescribePriceRequestSystemDisk systemDisk;

    /**
     * <p>The number of Elastic Compute Service (ECS) instances that you want to purchase in batch. You can use this parameter to query the price of batch purchasing instances of a specific configuration. Valid values: 1 to 1000.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. Only the unlimited mode within the service effective period is supported.</p>
     * <p>Default value: Unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>The capacity, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Capacity")
    public Integer capacity;

    /**
     * <p>The dedicated host type. You can call <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> to query the most recent list of dedicated host types.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.c5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>This parameter takes effect only when ResourceType is set to instance.</p>
     * <p>The image ID, which specifies the runtime environment to load when the instance starts. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources. If you do not specify this parameter, the price of a Linux image is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_7_05_64_20G_alibase_20181212.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The total number of instances to reserve within an instance type.</p>
     * <p>Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The total number of vCPUs supported by the elasticity assurance. When you call this operation, the system calculates the number of instances required by the elasticity assurance based on the specified InstanceType (rounded up).</p>
     * <blockquote>
     * <p>When you call this operation to query the price of an elasticity assurance, you can specify only one of InstanceCoreCpuCount and InstanceAmount.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>vpc: Virtual Private Cloud (VPC).</li>
     * <li>classic: classic network. The classic network is no longer available. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement notice</a>.</li>
     * </ul>
     * <p>Default value: vpc.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type. You must specify this parameter when <code>ResourceType</code> is set to <code>instance</code>. For more details, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance type. Only a single instance type can be specified for the unlimited elasticity assurance service.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.xlarge</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The billing method for network bandwidth. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <p>Default value: PayByTraffic.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth, in Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the queried instance is an I/O optimized instance. Valid values:</p>
     * <ul>
     * <li>none: non-I/O optimization.</li>
     * <li>optimized: I/O optimized.</li>
     * </ul>
     * <p>If InstanceType is a <a href="https://help.aliyun.com/document_detail/55263.html">Series I</a> instance type, the default value is none.</p>
     * <p>If InstanceType is not a <a href="https://help.aliyun.com/document_detail/55263.html">Series I</a> instance type, the default value is optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The Internet Service Provider (ISP). Valid values: </p>
     * <ul>
     * <li>cmcc: China Mobile.</li>
     * <li>telecom: China Telecom.</li>
     * <li>unicom: China Unicom.</li>
     * <li>multiCarrier: multi-ISP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The payment option of the reserved instance. Valid values:</p>
     * <ul>
     * <li>No Upfront: no upfront.</li>
     * <li>Partial Upfront: partial upfront.</li>
     * <li>All Upfront: all upfront.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All Upfront</p>
     */
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing duration of Elastic Compute Service (ECS). Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If the PriceUnit parameter is set to Month: 1 to 9.</li>
     * <li>If the PriceUnit parameter is set to Year: 1 to 5.</li>
     * <li>If the PriceUnit parameter is set to Hour: 1.</li>
     * <li>If the PriceUnit parameter is set to Week: 1 to 4.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If the PriceUnit parameter is set to Month: 1 to 9.</li>
     * <li>If the PriceUnit parameter is set to Year: 1 to 5.</li>
     * <li>If the PriceUnit parameter is set to Hour: 1.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The operating system type of the image used by the instance. Valid values: </p>
     * <ul>
     * <li>Windows: Windows Server operating system.</li>
     * <li>Linux: Linux and Unix-like operating systems.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The pricing unit for querying Elastic Compute Service (ECS) prices across different billing cycles. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Month: monthly pricing unit.</li>
     * <li>Year: yearly pricing unit.</li>
     * <li>Hour (default): hourly pricing unit.</li>
     * <li>Week: weekly pricing unit.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Month: monthly pricing unit.</li>
     * <li>Year: yearly pricing unit.</li>
     * <li>Hour (default): hourly pricing unit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The list of recurrence rules for the time-sharing elasticity assurance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The time-sharing elasticity assurance feature is available only in specific regions and for specific users. To use this feature, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>The time-sharing elasticity assurance feature is available only in specific regions and for specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<DescribePriceRequestRecurrenceRules> recurrenceRules;

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
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>instance: queries the latest price list of ECS instances. When this parameter is set to <code>instance</code>, you must also specify <code>InstanceType</code>.</li>
     * <li>disk: queries the latest price list of disks. When this parameter is set to <code>disk</code>, you must also specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code>.</li>
     * <li>diskperformance: queries the latest price list of provisioned performance for ESSD AutoPL disks. You must also specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code>.</li>
     * <li>bandwidth: queries the latest price list of bandwidth.</li>
     * <li>ddh: queries the latest price list of dedicated hosts.</li>
     * <li>ElasticityAssurance: queries the price of the elasticity assurance service. When this parameter is set to <code>ElasticityAssurance</code>, you must also specify <code>InstanceType</code>.</li>
     * <li>CapacityReservation: queries the price of the capacity reservation service. When this parameter is set to <code>CapacityReservation</code>, you must also specify <code>InstanceType</code>.</li>
     * </ul>
     * <p>Default value: instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values: </p>
     * <ul>
     * <li>Region: regional. </li>
     * <li>Zone: zonal.</li>
     * </ul>
     * <p>Default value: Region.</p>
     * 
     * <strong>example:</strong>
     * <p>Zone</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period of the spot instance, in hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released for 1 hour. After 1 hour, the system automatically compares the bid price with the market price and checks resource availability to determine whether to retain automatic release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system automatically compares the bid price with the market price and checks resource availability to determine whether to retain automatic release the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. Select an appropriate protection period based on the expected task execution duration.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The bidding policy for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: a regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: a spot instance with a maximum price limit.</li>
     * <li>SpotAsPriceGo: a spot instance priced at the market price with the pay-as-you-go price as the upper limit.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>PriceUnit=Hour</code> and <code>Period=1</code>. Because the default value of <code>PriceUnit</code> is <code>Hour</code> and the default value of <code>Period</code> is <code>1</code>, you do not need to set <code>PriceUnit</code> or <code>Period</code> when you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The effective period when the time-sharing elasticity assurance takes effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-30T06:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>Spot instance prices may vary across zones. When you query spot instance prices, specify ZoneId to query the price in a specific zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hagzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setDataDisk(java.util.List<DescribePriceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DescribePriceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public DescribePriceRequest setSchedulerOptions(DescribePriceRequestSchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public DescribePriceRequestSchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public DescribePriceRequest setSystemDisk(DescribePriceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribePriceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribePriceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribePriceRequest setAssuranceTimes(String assuranceTimes) {
        this.assuranceTimes = assuranceTimes;
        return this;
    }
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    public DescribePriceRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public DescribePriceRequest setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public DescribePriceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribePriceRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public DescribePriceRequest setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
        this.instanceCpuCoreCount = instanceCpuCoreCount;
        return this;
    }
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    public DescribePriceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribePriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribePriceRequest setInstanceTypeList(java.util.List<String> instanceTypeList) {
        this.instanceTypeList = instanceTypeList;
        return this;
    }
    public java.util.List<String> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    public DescribePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribePriceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribePriceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribePriceRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribePriceRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribePriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribePriceRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public DescribePriceRequest setRecurrenceRules(java.util.List<DescribePriceRequestRecurrenceRules> recurrenceRules) {
        this.recurrenceRules = recurrenceRules;
        return this;
    }
    public java.util.List<DescribePriceRequestRecurrenceRules> getRecurrenceRules() {
        return this.recurrenceRules;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribePriceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribePriceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public DescribePriceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribePriceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribePriceRequestDataDisk extends TeaModel {
        /**
         * <p>The category of data disk N. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL disk.
         * &lt;props=&quot;china&quot;&gt;</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of data disk N when the disk type is ESSD. This parameter is valid only when <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li>PL0.</li>
         * <li>PL1 (default).</li>
         * <li>PL2.</li>
         * <li>PL3.</li>
         * </ul>
         * <p>Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N, in GiB. Valid values:</p>
         * <ul>
         * <li><p>cloud: 5 to 2000.</p>
         * </li>
         * <li><p>cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>cloud_auto: 1 to 32768.
         * &lt;props=&quot;china&quot;&gt;</p>
         * </li>
         * <li><p>cloud_essd_entry: 10 to 32768.</p>
         * </li>
         * <li><p>cloud_essd: The valid values depend on the value of <code>DataDisk.N.PerformanceLevel</code>.	</p>
         * <ul>
         * <li>PL0: 1 to 32768.</li>
         * <li>PL1: 20 to 32768.</li>
         * <li>PL2: 461 to 32768.</li>
         * <li>PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li><p>ephemeral_ssd: 5 to 800.</p>
         * </li>
         * </ul>
         * <p>Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × capacity, 50000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        public static DescribePriceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestDataDisk self = new DescribePriceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePriceRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribePriceRequestDataDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePriceRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

    }

    public static class DescribePriceRequestSchedulerOptions extends TeaModel {
        /**
         * <p>This parameter takes effect only when ResourceType is set to instance.</p>
         * <p>The dedicated host ID. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The deployment set strategy. Valid values:</p>
         * <ul>
         * <li>Availability: high availability.</li>
         * <li>AvailabilityGroup: deployment set group high availability.</li>
         * <li>LowLatency: low network latency.</li>
         * <li>ProximityLooseDispersion: proximity loose dispersion.</li>
         * </ul>
         * <blockquote>
         * <p>Only when the strategy is set to ProximityLooseDispersion does the API response include the price details for &quot;Resource&quot;: &quot;deploymentSet&quot;. Other deployment set strategies are free of charge, so the API response does not include price information for &quot;Resource&quot;: &quot;deploymentSet&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ProximityLooseDispersion</p>
         */
        @NameInMap("DeploymentSetStrategy")
        public String deploymentSetStrategy;

        public static DescribePriceRequestSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestSchedulerOptions self = new DescribePriceRequestSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestSchedulerOptions setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribePriceRequestSchedulerOptions setDeploymentSetStrategy(String deploymentSetStrategy) {
            this.deploymentSetStrategy = deploymentSetStrategy;
            return this;
        }
        public String getDeploymentSetStrategy() {
            return this.deploymentSetStrategy;
        }

    }

    public static class DescribePriceRequestSystemDisk extends TeaModel {
        /**
         * <p>The category of the system disk. You must also specify <code>ImageId</code> when querying the system disk price. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL disk.
         * &lt;props=&quot;china&quot;&gt;</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value description:</p>
         * <ul>
         * <li>If InstanceType is a retired instance type and <code>IoOptimized</code> is set to <code>none</code>, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only cloud_essd, the default value is changed from cloud_efficiency to cloud_essd PL0. For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the system disk when the disk type is ESSD. This parameter is valid only when <code>SystemDiskCategory=cloud_essd</code>. Valid values:</p>
         * <p>PL0.
         * PL1 (default).
         * PL2.
         * PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk, in GiB. Valid values:</p>
         * <ul>
         * <li>Basic disk: 20 to 500.</li>
         * <li>ESSD:<ul>
         * <li>PL0: 1 to 2048.</li>
         * <li>PL1: 20 to 2048.</li>
         * <li>PL2: 461 to 2048.</li>
         * <li>PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL disk: 1 to 2048.</li>
         * <li>Other disk categories: 20 to 2048.</li>
         * </ul>
         * <p>Default value: max{20, image size of the specified ImageId parameter}.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribePriceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestSystemDisk self = new DescribePriceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePriceRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribePriceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribePriceRequestRecurrenceRules extends TeaModel {
        /**
         * <p>The end hour of the time-sharing assurance. The value must be a whole hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the recurrence rule. Valid values:</p>
         * <ul>
         * <li>Daily: daily recurrence.</li>
         * <li>Weekly: weekly recurrence.</li>
         * <li>Monthly: monthly recurrence.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The value of the recurrence rule.</p>
         * <ul>
         * <li>If <code>RecurrenceType</code> is set to <code>Daily</code>, you can specify only one value. Valid values: 1 to 31. This value indicates the interval in days between recurrences.</li>
         * <li>If <code>RecurrenceType</code> is set to <code>Weekly</code>, you can specify multiple values separated by commas (,). The values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> indicates Monday and Tuesday.</li>
         * <li>If <code>RecurrenceType</code> is set to <code>Monthly</code>, the format is <code>A-B</code>. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> indicates the 1st through 5th day of each month.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The effective period start hour of the time-sharing assurance. The value must be a whole hour.</p>
         * <blockquote>
         * <p>You must specify both StartHour and EndHour, and the difference between them must be at least 4 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("StartHour")
        public Integer startHour;

        public static DescribePriceRequestRecurrenceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestRecurrenceRules self = new DescribePriceRequestRecurrenceRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestRecurrenceRules setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public DescribePriceRequestRecurrenceRules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribePriceRequestRecurrenceRules setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribePriceRequestRecurrenceRules setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

}
