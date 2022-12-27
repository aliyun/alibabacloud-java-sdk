// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<DescribePriceRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public DescribePriceRequestSystemDisk systemDisk;

    // The number of ECS instances. You can specify this parameter when you want to query the prices of multiple instances that have specific specifications. Valid values: 1 to 1000.
    // 
    // Default value: 1.
    @NameInMap("Amount")
    public Integer amount;

    // The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective duration.
    // 
    // Default value: Unlimited.
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    @NameInMap("Capacity")
    public Integer capacity;

    // The dedicated host type. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to obtain the most recent list of dedicated host types.
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    // The ID of the image. Images contain the runtime environment to load when instances start. You can call the [DescribeImages](~~25534~~) operation to query the available images. If you do not specify this parameter, the system queries the prices of Linux images.
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    // The network type of the instance. Valid values:
    // 
    // *   classic: classic network
    // *   vpc: Virtual Private Cloud (VPC)
    // 
    // Default value: vpc.
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    // The instance type. When the `ResourceType` parameter is set to `instance`, you must specify the InstanceType parameter. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    // The billing method for network usage. Valid values:
    // 
    // *   PayByBandwidth: pay-by-bandwidth
    // *   PayByTraffic: pay-by-traffic
    // 
    // Default value: PayByTraffic.
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    // 
    // Default value: 0.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // Specifies whether the instance is I/O optimized. Valid values:
    // 
    // *   none: The instance is not I/O optimized.
    // *   optimized: The instance is I/O optimized.
    // 
    // If the instance type specified by the InstanceType parameter belongs to [Generation I instance families](~~55263~~), the default value is none.
    // 
    // If the instance type specified by the InstanceType parameter does not belong to [Generation I instance families](~~55263~~), the default value is optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The billing cycle of the ECS instance. Valid values:
    // 
    // *   Valid values when PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
    // *   Valid values when PriceUnit is set to Year: 1, 2, 3, 4, and 5.
    // *   Set the value to 1 when PriceUnit is set to Hour.
    // 
    // Default value: 1
    @NameInMap("Period")
    public Integer period;

    @NameInMap("Platform")
    public String platform;

    // The pricing unit of the ECS resource. Default value: Hour. Valid values:
    // 
    // *   Month
    // *   Year
    // *   Hour
    @NameInMap("PriceUnit")
    public String priceUnit;

    // The region ID of the ECS resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The type of the resource. Valid values:
    // 
    // *   instance: queries the most recent prices of ECS instances. When this parameter is set to `instance`, you must specify the `InstanceType` parameter.
    // *   disk: queries the most recent prices of disks. When this parameter is set to `disk`, you must specify both the `DataDisk.1.Category` and `DataDisk.1.Size` parameters.
    // *   bandwidth: queries the most recent prices for network usage.
    // *   ddh: queries the most recent prices of dedicated hosts.
    // *   ElasticityAssurance: queries the most recent prices of elasticity assurances. When this parameter is set to `ElasticityAssurance`, you must specify the `InstanceType` parameter.
    // *   ElasticityAssurance: queries the most recent prices of capacity reservations. When this parameter is set to `CapacityReservation`, you must specify the `InstanceType` parameter.
    // 
    // Default value: instance.
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scope")
    public String scope;

    // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
    // 
    // *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
    // *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
    // 
    // Default value: 1.
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    // The preemption policy for the pay-as-you-go instance. Valid values:
    // 
    // *   NoSpot: The instance is a regular pay-as-you-go instance.
    // *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
    // *   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.
    // 
    // Default value: NoSpot.
    // 
    // >  This parameter is valid only when the `PriceUnit` parameter is set to Hour and the `Period` parameter is set to 1. The default value of the `PriceUnit` parameter is `Hour` and the default value of the `Period` parameter is `1`. Therefore, you do not need to set the `PriceUnit` and `Period` parameters when you set the SpotStrategy parameter.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The zone ID of the ECS resource.
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
        @NameInMap("Category")
        public String category;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

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

    public static class DescribePriceRequestSystemDisk extends TeaModel {
        // The category of the system disk. Valid values:
        // 
        // *   cloud: basic disk
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   ephemeral_ssd: local SSD
        // *   cloud_essd: enhanced SSD (ESSD)
        // 
        // Description of the default values:
        // 
        // *   When the InstanceType parameter is set to a retired instance type and the `IoOptimized` parameter is set to `none`, the default value of this parameter is `cloud`.
        // *   In other cases, the default value of this parameter is `cloud_efficiency`.
        @NameInMap("Category")
        public String category;

        // The performance level of the system disk when it is an ESSD. This parameter is valid only when the `SystemDiskCategory` parameter is set to cloud_essd. Default value: PL1. Valid values:
        // 
        // *   PL0
        // *   PL1
        // *   PL2
        // *   PL3
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The size of the system disk. Unit: GiB. Valid values: 20 to 500.
        // 
        // Default value: 40 or the image size, whichever is greater.
        // 
        // >  The value of this parameter must be at least 20 and greater than or equal to the image size.
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
