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
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective period.</p>
     * <br>
     * <p>Default value: Unlimited.</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>The storage capacity. Unit: GiB.</p>
     */
    @NameInMap("Capacity")
    public Integer capacity;

    /**
     * <p>The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to query the most recent list of dedicated host types.</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The image ID. An image contains the runtime environment to load when an instance is started. You can call the [DescribeImages](~~25534~~) operation to query the available images. If you do not specify this parameter, the system queries the prices of Linux images.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The total number of reserved instances for an instance type.</p>
     * <br>
     * <p>Valid values: 1 to 1000.</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The total number of vCPUs supported by the elasticity assurance. When you call this API operation, the system calculates the number of instances that an elasticity assurance must support based on the specified value of InstanceType. The calculated value is rounded up to the nearest integer.</p>
     * <br>
     * <p>> When you call this API operation to query the price of an elasticity assurance, you can only specify either InstanceCoreCpuCount or InstanceAmount.</p>
     */
    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   classic: classic network</p>
     * <p>*   vpc: Virtual Private Cloud (VPC)</p>
     * <br>
     * <p>Default value: vpc.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type. When `ResourceType` is set to `instance`, you must specify this parameter. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance types. You can select only a single instance type when you configure an elasticity assurance in unlimited mode.</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic: pay-by-traffic</p>
     * <br>
     * <p>Default value: PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <br>
     * <p>*   none: The instance is not I/O optimized.</p>
     * <p>*   optimized: The instance is I/O optimized.</p>
     * <br>
     * <p>When the instance type specified by the InstanceType parameter belongs to [Generation I instance families](~~55263~~), the default value of this parameter is none.</p>
     * <br>
     * <p>When the instance type specified by the InstanceType parameter does not belong to [Generation I instance families](~~55263~~), the default value of this parameter is optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <br>
     * <p>*   cmcc: China Mobile</p>
     * <p>*   telecom: China Telecom</p>
     * <p>*   unicom: China Unicom</p>
     * <p>*   multiCarrier: multi-line ISP</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The payment option of the reserved instance. Valid values:</p>
     * <br>
     * <p>*   No Upfront</p>
     * <p>*   Partial Upfront</p>
     * <p>*   All Upfront</p>
     */
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing cycle of the ECS instance. Valid values:</p>
     * <br>
     * <p>*   Valid values when PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * <p>*   Valid values when PriceUnit is set to Year: 1, 2, 3, 4, and 5.</p>
     * <p>*   Set the value to 1 when PriceUnit is set to Hour.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The operating system of the image that is used by the instance. Valid values:</p>
     * <br>
     * <p>*   Windows: Windows Server operating system</p>
     * <p>*   Linux: Linux and UNIX-like operating system</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The pricing unit of the ECS resource. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <p>*   Hour (default)</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   instance: queries the most recent prices of ECS instances. When this parameter is set to `instance`, you must specify `InstanceType`.</p>
     * <p>*   disk: queries the most recent prices of cloud disks. When this parameter is set to `disk`, you must specify `DataDisk.1.Category` and `DataDisk.1.Size`.</p>
     * <p>*   bandwidth: queries the most recent prices of network usage.</p>
     * <p>*   ddh: queries the most recent prices of dedicated hosts.</p>
     * <p>*   ElasticityAssurance: queries the most recent prices of elasticity assurances. When this parameter is set to `ElasticityAssurance`, you must specify `InstanceType`.</p>
     * <p>*   CapacityReservation: queries the most recent prices of capacity reservations. When this parameter is set to `CapacityReservation`, you must specify `InstanceType`.</p>
     * <br>
     * <p>Default value: instance.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values:</p>
     * <br>
     * <p>*   Region: regional</p>
     * <p>*   Zone: zonal</p>
     * <br>
     * <p>Default value: Region.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <br>
     * <p>- 1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bidding price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <br>
     * <p>- 0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the biding price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <br>
     * <p>Alibaba Cloud sends ECS system events to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * <br>
     * <p>>If you set SpotStrategy to SpotWithPriceLimit or SpotAsPriceGo, this parameter takes effect.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</p>
     * <br>
     * <p>Default value: NoSpot</p>
     * <br>
     * <p>> This parameter is valid only when `PriceUnit` is set to Hour and `Period` is set to 1. The default value of `PriceUnit` is `Hour` and the default value of `Period` is `1`. Therefore, you do not need to set `PriceUnit` and `Period` when you set SpotStrategy.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The zone ID.</p>
     * <br>
     * <p>> Prices of preemptible instances vary based on zones. When you query the price of a preemptible instance, specify ZoneId.</p>
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

    public DescribePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribePriceRequestDataDisk extends TeaModel {
        /**
         * <p>The type of data disk N. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   ephemeral_ssd: local SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <br>
         * <p>Valid values of N: 1 to 16.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of data disk N when the disk is an ESSD. This parameter is valid only when `DataDisk.N.Category` is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>*   PL0</p>
         * <p>*   PL1 (default)</p>
         * <p>*   PL2</p>
         * <p>*   PL3</p>
         * <br>
         * <p>Valid values of N: 1 to 16.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Valid values when Category is set to cloud: 5 to 2000.</p>
         * <br>
         * <p>*   Valid values when Category is set to cloud_efficiency: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values when DataDisk.N.Category is set to cloud_essd: depend on the value of `DataDisk.N.PerformanceLevel`.</p>
         * <br>
         * <p>    *   Valid values when DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.</p>
         * <p>    *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</p>
         * <p>    *   Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</p>
         * <p>    *   Valid values when DataDisk.4.PerformanceLevel is set to PL3: 1261 to 32768.</p>
         * <br>
         * <p>*   Valid values when DataDisk.N.Category is set to ephemeral_ssd: 5 to 800.</p>
         * <br>
         * <p>Valid values of N: 1 to 16.</p>
         */
        @NameInMap("Size")
        public Long size;

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

    }

    public static class DescribePriceRequestSchedulerOptions extends TeaModel {
        /**
         * <p>专有宿主机ID。您可以通过[DescribeDedicatedHosts ](~~134242~~)查询专有宿主机ID列表。</p>
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
         * <p>The type of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   ephemeral_ssd: local SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         * <br>
         * <p>Description of the default values:</p>
         * <br>
         * <p>*   When the InstanceType parameter is set to a retired instance type and `IoOptimized` is set to `none`, the default value of this parameter is `cloud`.</p>
         * <p>*   In other cases, the default value of this parameter is `cloud_efficiency`.</p>
         * <br>
         * <p>> If you want to query the prices of system disks, you must also specify `ImageId`.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the system disk when the disk is an ESSD. This parameter is valid only when `SystemDiskCategory` is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>PL0, PL1 (default), PL2, PL3.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 20 to 500.</p>
         * <br>
         * <p>Default value: 20 or the image size, whichever is greater.</p>
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

}
