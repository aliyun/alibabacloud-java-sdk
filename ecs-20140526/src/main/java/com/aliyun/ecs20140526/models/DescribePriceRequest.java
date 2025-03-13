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
     * <p>The number of ECS instances. You can specify this parameter when you want to query the prices of multiple instances that have specific specifications. Valid values: 1 to 1000.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective period.</p>
     * <p>Default value: Unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>The storage capacity. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Capacity")
    public Integer capacity;

    /**
     * <p>The type of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> operation to query the most recent list of dedicated host types.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.c5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>This parameter takes effect only when ResourceType is set to instance.</p>
     * <p>The image ID. Images contain the runtime environments to load when instances start. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available images. If you do not specify this parameter, the system queries the prices of Linux images.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_7_05_64_20G_alibase_20181212.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The total number of reserved instances for an instance type.</p>
     * <p>Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The total number of vCPUs supported by the elasticity assurance. When you call this API operation, the system calculates the number of instances that an elasticity assurance must support based on the specified value of InstanceType. The calculated value is rounded up to the nearest integer.</p>
     * <blockquote>
     * <p>When you call this API operation to query the price of an elasticity assurance, you can only specify either InstanceCoreCpuCount or InstanceAmount.</p>
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
     * <li>classic: classic network</li>
     * <li>vpc: Virtual Private Cloud (VPC)</li>
     * </ul>
     * <p>Default value: vpc.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type. When <code>ResourceType</code> is set to <code>instance</code>, you must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent list of instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance types. You can select only a single instance type when you configure an elasticity assurance in unlimited mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.xlarge</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth</li>
     * <li>PayByTraffic: pay-by-traffic</li>
     * </ul>
     * <p>Default value: PayByTraffic</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li>none: The instance is not I/O optimized.</li>
     * <li>optimized: The instance is I/O optimized.</li>
     * </ul>
     * <p>When the instance type specified by the InstanceType parameter belongs to <a href="https://help.aliyun.com/document_detail/55263.html">Generation I instance families</a>, the default value of this parameter is none.</p>
     * <p>When the instance type specified by the InstanceType parameter does not belong to <a href="https://help.aliyun.com/document_detail/55263.html">Generation I instance families</a>, the default value of this parameter is optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <ul>
     * <li>cmcc: China Mobile</li>
     * <li>telecom: China Telecom</li>
     * <li>unicom: China Unicom</li>
     * <li>multiCarrier: multi-line ISP</li>
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
     * <li>No Upfront</li>
     * <li>Partial Upfront</li>
     * <li>All Upfront</li>
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
     * <p>The billing cycle of the ECS instance. Valid values:</p>
     * <ul>
     * <li>Valid values when PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>Valid values when PriceUnit is set to Year: 1, 2, 3, 4, and 5.</li>
     * <li>Set the value to 1 when PriceUnit is set to Hour.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The operating system of the image that is used by the instance. Valid values:</p>
     * <ul>
     * <li>Windows: Windows Server operating system</li>
     * <li>Linux: Linux and UNIX-like operating system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The pricing unit of the ECS resource. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * <li>Hour (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>Recurrence rules for the time-segmented assurance of the elasticity assurance.</p>
     * <blockquote>
     * <p> The time-segmented assurance of the elasticity assurance is available only in specific regions and to specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<DescribePriceRequestRecurrenceRules> recurrenceRules;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
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
     * <li>instance: queries the most recent prices of ECS instances. If you set this parameter to <code>instance</code>, specify <code>InstanceType</code>.</li>
     * <li>disk: queries the most recent prices of cloud disks. If you set this parameter to <code>disk</code>, specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code>.</li>
     * <li>diskperformance: Queries the most recent prices of the provioned performance of the Enterprise SSD (ESSD) AutoPL disk. You must also specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code>.</li>
     * <li>bandwidth: queries the most recent prices for network usage.</li>
     * <li>ddh: queries the most recent prices of dedicated hosts.</li>
     * <li>ElasticityAssurance: queries the most recent prices of elasticity assurances. If you set this parameter to <code>ElasticityAssurance</code>, specify <code>InstanceType</code>.</li>
     * <li>CapacityReservation: queries the most recent prices of capacity reservations. If you set this parameter to <code>CapacityReservation</code>, specify <code>InstanceType</code>.</li>
     * </ul>
     * <p>Default value: instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values:</p>
     * <ul>
     * <li>Region: regional</li>
     * <li>Zone: zonal</li>
     * </ul>
     * <p>Default value: Region.</p>
     * 
     * <strong>example:</strong>
     * <p>Zone</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
     * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * <blockquote>
     * <p> This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance that has a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance whose bid price is based on the market price at the time of purchase. The market price can be up to the pay-as-you-go price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * <blockquote>
     * <p> This parameter takes effect only when <code>PriceUnit</code> is set to Hour and <code>Period</code> is set to 1. The default value of <code>PriceUnit</code> is <code>Hour</code> and the default value of <code>Period</code> is <code>1</code>. Therefore, you do not need to set <code>PriceUnit</code> or <code>Period</code> when you set SpotStrategy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The time when the time-segmented assurance of the elasticity assurance takes effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-30T06:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>Prices of preemptible instances vary based on zones. When you query the price of a preemptible instance, specify ZoneId.</p>
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
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * </ul>
         * <p>Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of data disk N when the disk is an ESSD. This parameter takes effect only when <code>DataDisk.N.Category</code> is set to cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1 (default)</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * <p>Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Valid values if DataDisk.N.Category is set to cloud: 5 to 2000.</p>
         * </li>
         * <li><p>Valid values if DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if DataDisk.N.Category is set to cloud_auto: 1 to 32768.</p>
         * </li>
         * <li><p>Valid values if DataDisk.N.Category is set to cloud_essd: vary based on the <code>DataDisk.N.PerformanceLevel</code> value.</p>
         * <ul>
         * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL0: 1 to 32768.</li>
         * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</li>
         * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</li>
         * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li><p>Valid values if DataDisk.N.Category is set to ephemeral_ssd: 5 to 800.</p>
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
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as data disk N. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set <code>DataDisk.N.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <p>The ID of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the dedicated host list.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

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

    }

    public static class DescribePriceRequestSystemDisk extends TeaModel {
        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>ephemeral_ssd: local SSD</li>
         * <li>cloud_essd: Enterprise SSD (ESSD)</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>When InstanceType is set to a retired instance type and <code>IoOptimized</code> is set to <code>none</code>, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to query the price of a system disk, you must also specify <code>ImageId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the system disk when the disk is an ESSD. This parameter is valid only when <code>SystemDiskCategory</code> is set to cloud_essd. Valid values:</p>
         * <p>PL0, PL1 (default), PL2, PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic disk (cloud): 20 to 500.</p>
         * </li>
         * <li><p>ESSD (cloud_essd): Valid values vary based on the SystemDisk.PerformanceLevel value.</p>
         * <ul>
         * <li>Valid values when SystemDisk.PerformanceLevel is set to PL0: 1 to 2048.</li>
         * <li>Valid values when SystemDisk.PerformanceLevel is set to PL1: 20 to 2048.</li>
         * <li>Valid values when SystemDisk.PerformanceLevel is set to PL2: 461 to 2048.</li>
         * <li>Valid values when SystemDisk.PerformanceLevel is set to PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>Default value: 20 or the size of the image specified by ImageId, whichever is greater.</p>
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
         * <p>The time when the time-segmented assurance ends. The value must be on the hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the recurrence rule. Valid values:</p>
         * <ul>
         * <li>Daily</li>
         * <li>Weekly</li>
         * <li>Monthly</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is specified, specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The recurrency value of the time-segmented assurance.</p>
         * <ul>
         * <li>If you set <code>RecurrenceType</code> to <code>Daily</code>, you can set RecurrenceValue to only one value. Valid values: 1 to 31. The time-segmented assurance is performed every few days.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Weekly</code>, you can set RecurrenceValue to one or more values. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> indicates that the time-segmented assurance is performed on Monday and Tuesday of every week.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Monthly</code>, you can set RecurrenceValue to two values in the <code>A-B</code> format. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> indicates that the time-segmented assurance is performed from the 1st to the 5th of each month.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is specified, you must specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The time when the time-segmented assurance takes effect. The value must be on the hour.</p>
         * <blockquote>
         * <p> You must specify both StartHour and EndHour. The EndHour time must be at least 4 hours later than the StartHour time.</p>
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
