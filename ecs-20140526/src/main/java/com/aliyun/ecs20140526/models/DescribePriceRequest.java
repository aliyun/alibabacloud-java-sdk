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
     * <p>The number of resources for which to query prices. Valid values: 1–1000.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The number of times the elasticity assurance can be used. Set this to <code>Unlimited</code>, which allows the assurance to be used any number of times during its effective period.</p>
     * <p>Default value: <code>Unlimited</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>The memory capacity for the elasticity assurance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Capacity")
    public Integer capacity;

    /**
     * <p>The dedicated host type. You can call the <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> operation to query dedicated host types.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.c5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>This parameter is valid only when <code>ResourceType</code> is set to <code>instance</code>.</p>
     * <p>The ID of the image. The image provides the runtime environment for the instance. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available images. If you do not specify this parameter, the system queries prices for Linux instances by default.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_7_05_64_20G_alibase_20181212.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The number of instances to include in the reserved instance offering.</p>
     * <p>Valid values: 1–1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The total number of vCPUs for instances that are covered by the elasticity assurance. When you call this operation, the system calculates the number of supported instances based on the specified <code>InstanceType</code> and rounds the value up to the nearest integer.</p>
     * <blockquote>
     * <p>When you query the price of an elasticity assurance, you can specify only one of the <code>InstanceCpuCoreCount</code> and <code>InstanceAmount</code> parameters.</p>
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
     * <li><p><code>classic</code>: classic network</p>
     * </li>
     * <li><p><code>vpc</code>: VPC</p>
     * </li>
     * </ul>
     * <p>Default value: <code>vpc</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type. This parameter is required when <code>ResourceType</code> is set to <code>instance</code>. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance type families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance type. You can specify only one instance type for an elasticity assurance of the <code>Unlimited</code> type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.xlarge</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li><p><code>PayByBandwidth</code>: pay-by-bandwidth</p>
     * </li>
     * <li><p><code>PayByTraffic</code>: pay-by-traffic</p>
     * </li>
     * </ul>
     * <p>Default value: <code>PayByTraffic</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0–100.</p>
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
     * <li><p><code>none</code>: non-I/O-optimized.</p>
     * </li>
     * <li><p><code>optimized</code>: I/O-optimized.</p>
     * </li>
     * </ul>
     * <p>For <a href="https://help.aliyun.com/document_detail/55263.html">generation I</a> instances, the default value is <code>none</code>.</p>
     * <p>For other instance types, the default value is <code>optimized</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <ul>
     * <li><p><code>cmcc</code>: China Mobile</p>
     * </li>
     * <li><p><code>telecom</code>: China Telecom</p>
     * </li>
     * <li><p><code>unicom</code>: China Unicom</p>
     * </li>
     * <li><p><code>multiCarrier</code>: BGP (Multi-ISP)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The payment option for the reserved instance. Valid values:</p>
     * <ul>
     * <li><p><code>No Upfront</code></p>
     * </li>
     * <li><p><code>Partial Upfront</code></p>
     * </li>
     * <li><p><code>All Upfront</code></p>
     * </li>
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
     * <p>The billing duration of the resource. This parameter is used with <code>PriceUnit</code>. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>If <code>PriceUnit</code> is set to <code>Month</code>: 1–9.</p>
     * </li>
     * <li><p>If <code>PriceUnit</code> is set to <code>Year</code>: 1–5.</p>
     * </li>
     * <li><p>If <code>PriceUnit</code> is set to <code>Hour</code>: 1.</p>
     * </li>
     * <li><p>If <code>PriceUnit</code> is set to <code>Week</code>: 1–4.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>If <code>PriceUnit</code> is set to <code>Month</code>: 1–9.</p>
     * </li>
     * <li><p>If <code>PriceUnit</code> is set to <code>Year</code>: 1–5.</p>
     * </li>
     * <li><p>If <code>PriceUnit</code> is set to <code>Hour</code>: 1.</p>
     * </li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The operating system of the instance. Valid values:</p>
     * <ul>
     * <li><p><code>Windows</code>: Windows Server</p>
     * </li>
     * <li><p><code>Linux</code>: Linux</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The billing cycle of the resource. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p><code>Month</code>: For monthly pricing.</p>
     * </li>
     * <li><p><code>Year</code>: For yearly pricing.</p>
     * </li>
     * <li><p><code>Hour</code> (Default): For hourly pricing.</p>
     * </li>
     * <li><p><code>Week</code>: For weekly pricing.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p><code>Month</code>: For monthly pricing.</p>
     * </li>
     * <li><p><code>Year</code>: For yearly pricing.</p>
     * </li>
     * <li><p><code>Hour</code> (Default): For hourly pricing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The list of recurrence rules for the time-based elasticity assurance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The time-based elasticity assurance feature is available only in specific regions and to specific users. To use this feature, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>The time-based elasticity assurance feature is available only in specific regions and to specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<DescribePriceRequestRecurrenceRules> recurrenceRules;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the list of Alibaba Cloud regions.</p>
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
     * <p>The type of the resource for which you want to query the price. Valid values:</p>
     * <ul>
     * <li><p><code>instance</code>: Query the prices of ECS instances. If you set this parameter to <code>instance</code>, you must also specify the <code>InstanceType</code> parameter.</p>
     * </li>
     * <li><p><code>disk</code>: Query the prices of cloud disks. If you set this parameter to <code>disk</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code> parameters.</p>
     * </li>
     * <li><p><code>diskperformance</code>: Query the prices of the provisioned performance of an ESSD AutoPL cloud disk. You must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code> parameters.</p>
     * </li>
     * <li><p><code>bandwidth</code>: Query the prices of network bandwidth.</p>
     * </li>
     * <li><p><code>ddh</code>: Query the prices of dedicated hosts.</p>
     * </li>
     * <li><p><code>ElasticityAssurance</code>: Query the prices of Elasticity Assurance. If you set this parameter to <code>ElasticityAssurance</code>, you must also specify the <code>InstanceType</code> parameter.</p>
     * </li>
     * <li><p><code>CapacityReservation</code>: Query the prices of Capacity Reservation. If you set this parameter to <code>CapacityReservation</code>, you must also specify the <code>InstanceType</code> parameter.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>instance</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values:</p>
     * <ul>
     * <li><p><code>Region</code>: region-scoped</p>
     * </li>
     * <li><p><code>Zone</code>: zone-scoped</p>
     * </li>
     * </ul>
     * <p>Default value: <code>Region</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Zone</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p><code>1</code>: Alibaba Cloud does not automatically release the instance within 1 hour. After the 1-hour protection period ends, the system checks the market price and resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * <li><p><code>0</code>: The instance has no protection period. The system checks the market price and resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * </ul>
     * <p>Alibaba Cloud sends you an ECS system event five minutes before the instance is released. Spot instances are billed by the second. Select a protection period based on the time required to complete your task.</p>
     * <blockquote>
     * <p>This parameter is valid only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code> or <code>SpotAsPriceGo</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li><p><code>NoSpot</code>: A regular pay-as-you-go instance.</p>
     * </li>
     * <li><p><code>SpotWithPriceLimit</code>: A spot instance for which you specify a maximum hourly price.</p>
     * </li>
     * <li><p><code>SpotAsPriceGo</code>: A spot instance where the system automatically bids up to the pay-as-you-go price.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NoSpot</code>.</p>
     * <blockquote>
     * <p>This parameter applies only when you query hourly prices, where <code>PriceUnit</code> is <code>Hour</code> and <code>Period</code> is <code>1</code>. Because these are the default values, you do not need to set them when you use <code>SpotStrategy</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The time when the time-based elasticity assurance takes effect. The time must be specified in UTC and formatted as <code>yyyy-MM-ddTHH:mm:ssZ</code> in accordance with the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-30T06:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the availability zone.</p>
     * <blockquote>
     * <p>The prices of spot instances may vary by availability zone. When you query the price of a spot instance, specify <code>ZoneId</code> to query the price for a specific availability zone.</p>
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
         * <li><p><code>cloud</code>: basic cloud disk</p>
         * </li>
         * <li><p><code>cloud_efficiency</code>: efficiency cloud disk</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: SSD cloud disk</p>
         * </li>
         * <li><p><code>ephemeral_ssd</code>: local SSD</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><code>cloud_essd_entry</code>: ESSD Entry</li>
         * </ul>
         * <p>The value of N can be 1–16.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of data disk N when it is an ESSD. This parameter is valid only when <code>DataDisk.N.Category</code> is set to <code>cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li><p><code>PL0</code></p>
         * </li>
         * <li><p><code>PL1</code> (Default)</p>
         * </li>
         * <li><p><code>PL2</code></p>
         * </li>
         * <li><p><code>PL3</code></p>
         * </li>
         * </ul>
         * <p>The value of N can be 1–16.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p><code>cloud</code>: 5–2000</p>
         * </li>
         * <li><p><code>cloud_efficiency</code>: 20–32768</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: 20–32768</p>
         * </li>
         * <li><p><code>cloud_auto</code>: 1–32768</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><code>cloud_essd_entry</code>: 10–32768</p>
         * </li>
         * <li><p><code>cloud_essd</code>: The value range depends on the <code>DataDisk.N.PerformanceLevel</code>.</p>
         * <ul>
         * <li><p>PL0: 1–32768</p>
         * </li>
         * <li><p>PL1: 20–32768</p>
         * </li>
         * <li><p>PL2: 461–32768</p>
         * </li>
         * <li><p>PL3: 1261–32768</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>ephemeral_ssd</code>: 5–800</p>
         * </li>
         * </ul>
         * <p>The value of N can be 1–16.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The provisioned read/write IOPS for the ESSD AutoPL cloud disk. Valid values: 0–<code>min{50000, 1000 * Capacity - Baseline IOPS}</code>.</p>
         * <p><code>Baseline IOPS = min{1800 + 50 * Capacity, 50000}</code>.</p>
         * <blockquote>
         * <p>This parameter is valid only when <code>DataDisk.N.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
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
         * <p>This parameter is valid only when <code>ResourceType</code> is set to <code>instance</code>.</p>
         * <p>The ID of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query dedicated host IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The deployment set strategy. Valid values:</p>
         * <ul>
         * <li><p><code>Availability</code>: high availability</p>
         * </li>
         * <li><p><code>AvailabilityGroup</code>: high availability for deployment set groups</p>
         * </li>
         * <li><p><code>LowLatency</code>: low latency</p>
         * </li>
         * <li><p><code>ProximityLooseDispersion</code>: proximity loose dispersion</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Only the <code>ProximityLooseDispersion</code> strategy incurs a fee. The API response includes price details for the deployment set (where <code>Resource</code> is <code>deploymentSet</code>) only when this strategy is used. Other deployment set strategies are free of charge.</p>
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
         * <p>The category of the system disk. You must specify <code>ImageId</code> when you query the price of a system disk. Valid values:</p>
         * <ul>
         * <li><p><code>cloud</code>: basic cloud disk</p>
         * </li>
         * <li><p><code>cloud_efficiency</code>: efficiency cloud disk</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: SSD cloud disk</p>
         * </li>
         * <li><p><code>ephemeral_ssd</code>: local SSD</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><code>cloud_essd_entry</code>: ESSD Entry</li>
         * </ul>
         * <ul>
         * <li><p>For retired instance types where <code>IoOptimized</code> is <code>none</code>, the default value is <code>cloud</code>.</p>
         * </li>
         * <li><p>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only ESSDs, the default value will be changed from <code>cloud_efficiency</code> to <code>cloud_essd</code> at PL0. For more information, see the <a href="https://www.aliyun.com/notice/117844">change announcement</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the ESSD when used as a system disk. This parameter is valid only when <code>SystemDisk.Category</code> is set to <code>cloud_essd</code>. Valid values:</p>
         * <p><code>PL0</code><br><code>PL1</code> (Default)<br><code>PL2</code><br><code>PL3</code><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic cloud disk: 20–500.</p>
         * </li>
         * <li><p>ESSD cloud disk:</p>
         * <ul>
         * <li><p>PL0: 1–2048.</p>
         * </li>
         * <li><p>PL1: 20–2048.</p>
         * </li>
         * <li><p>PL2: 461–2048.</p>
         * </li>
         * <li><p>PL3: 1261–2048.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL cloud disk: 1–2048.</p>
         * </li>
         * <li><p>Other cloud disk categories: 20–2048.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>max{20, ImageSize}</code>, which is the greater of 20 and the size of the specified image (<code>ImageId</code>).</p>
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
         * <p>The end time of the time-based assurance. The value must be on the hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The recurrence type of the rule. Valid values:</p>
         * <ul>
         * <li><p><code>Daily</code>: repeats on a daily basis.</p>
         * </li>
         * <li><p><code>Weekly</code>: repeats on a weekly basis.</p>
         * </li>
         * <li><p><code>Monthly</code>: repeats on a monthly basis.</p>
         * </li>
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
         * <p>The recurrence value.</p>
         * <ul>
         * <li><p>If <code>RecurrenceType</code> is set to <code>Daily</code>, this parameter takes a single value that specifies the recurrence interval in days. Valid values: 1–31.</p>
         * </li>
         * <li><p>If <code>RecurrenceType</code> is set to <code>Weekly</code>, this parameter can have multiple values separated by commas (,). The values 0, 1, 2, 3, 4, 5, and 6 correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday. For example, <code>1,2</code> specifies Monday and Tuesday.</p>
         * </li>
         * <li><p>If <code>RecurrenceType</code> is set to <code>Monthly</code>, the value must be in the <code>A–B</code> format. The values of A and B must be between 1 and 31, and B must be greater than or equal to A. For example, <code>1–5</code> specifies the first to the fifth day of each month.</p>
         * </li>
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
         * <p>The start time of the time-based assurance. The value must be on the hour.</p>
         * <blockquote>
         * <p>Both <code>StartHour</code> and <code>EndHour</code> are required. The interval between them must be at least 4 hours.</p>
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
