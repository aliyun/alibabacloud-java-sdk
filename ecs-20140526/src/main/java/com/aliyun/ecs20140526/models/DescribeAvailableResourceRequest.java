// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    // The number of vCPUs of the instance type. For more information, see [Instance families](~~25378~~).
    // 
    // The Cores parameter takes effect only when the DestinationResource parameter is set to InstanceType.
    @NameInMap("Cores")
    public Integer cores;

    // The category of the data disk. Valid values:
    // 
    // *   cloud: basic disk
    // *   cloud_efficiency: ultra disk
    // *   cloud_ssd: standard SSD
    // *   ephemeral_ssd: local SSD
    // *   cloud_essd: ESSD
    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    // The ID of the dedicated host.
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    // The resource type to query. Valid values:
    // 
    // *   Zone: zone
    // *   IoOptimized: I/O optimized resource
    // *   InstanceType: instance type
    // *   SystemDisk: system disk
    // *   DataDisk: data disk
    // *   Network: network type
    // *   ddh: dedicated host
    // 
    // For more information about how to configure the DestinationResource parameter, see the **Description** section of this topic.
    @NameInMap("DestinationResource")
    public String destinationResource;

    // The billing method of the resource. For more information, see [Billing overview](~~25398~~). Valid values:
    // 
    // *   PrePaid: subscription
    // *   PostPaid: pay-as-you-go
    // 
    // Default value: PostPaid.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
    // 
    // For more information about how to configure the InstanceType parameter, see the **Description** section of this topic.
    @NameInMap("InstanceType")
    public String instanceType;

    // Specifies whether the instance is an I/O optimized instance. Valid values:
    // 
    // *   none: The instance is a non-I/O optimized instance.
    // *   optimized: The instance is an I/O optimized instance.
    // 
    // Default value: optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // The memory size of the instance type. Unit: GiB. For more information, see [Instance families](~~25378~~).
    // 
    // The Memory parameter takes effect only when the DestinationResource parameter is set to InstanceType.
    @NameInMap("Memory")
    public Float memory;

    // The network type. Valid values:
    // 
    // *   vpc
    // *   classic
    @NameInMap("NetworkCategory")
    public String networkCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the region for which to query resources. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The type of the resource. Valid values:
    // 
    // *   instance: ECS instance
    // *   disk: cloud disk
    // *   reservedinstance: reserved instance
    // *   ddh: dedicated host
    @NameInMap("ResourceType")
    public String resourceType;

    // The scope of the reserved instance. Valid values:
    // 
    // *   Region: regional
    // *   Zone: zonal
    @NameInMap("Scope")
    public String scope;

    // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
    // 
    // *   The following protection periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.
    // *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
    // 
    // Default value: 1.
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    // The bidding policy for the pay-as-you-go instance. Valid values:
    // 
    // *   NoSpot: The instance is created as a pay-as-you-go instance.
    // *   SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.
    // *   SpotAsPriceGo: The instance is created as a preemptible instance whose price is based on the market price at the time of purchase. The market price can be equal to the price of a pay-as-you-go instance.
    // 
    // Default value: NoSpot.
    // 
    // The SpotStrategy parameter takes effect only when the InstanceChargeType parameter is set to PostPaid.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The category of the system disk. Valid values:
    // 
    // *   cloud: basic disk
    // *   cloud_efficiency: ultra disk
    // *   cloud_ssd: standard SSD
    // *   ephemeral_ssd: local SSD
    // *   cloud_essd: enhanced SSD (ESSD)
    // 
    // Default value: cloud_efficiency.
    // 
    // >  When the ResourceType parameter is set to instance and the DestinationResource parameter is set to DataDisk, you must set the SystemDiskCategory parameter. If you do not set this parameter, the default value takes effect.
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    // The ID of the zone for which to query resources.
    // 
    // This parameter is empty by default. When this parameter is empty, the system returns resources that match the other criteria in all zones within the region specified by `RegionId`.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeAvailableResourceRequest setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public DescribeAvailableResourceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeAvailableResourceRequest setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public String getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeAvailableResourceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailableResourceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeAvailableResourceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeAvailableResourceRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeAvailableResourceRequest setNetworkCategory(String networkCategory) {
        this.networkCategory = networkCategory;
        return this;
    }
    public String getNetworkCategory() {
        return this.networkCategory;
    }

    public DescribeAvailableResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailableResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailableResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeAvailableResourceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeAvailableResourceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public DescribeAvailableResourceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeAvailableResourceRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
