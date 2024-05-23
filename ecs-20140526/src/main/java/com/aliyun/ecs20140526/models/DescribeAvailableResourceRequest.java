// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The number of vCPUs of the instance type. For more information, see [Instance families](~~25378~~).</p>
     * <br>
     * <p>The Cores parameter takes effect only when the DestinationResource parameter is set to InstanceType.</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The type of the data disk. Valid values:</p>
     * <br>
     * <p>*   cloud: basic disk.</p>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: standard SSD.</p>
     * <p>*   ephemeral_ssd: local SSD.</p>
     * <p>*   cloud_essd: ESSD.</p>
     */
    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    /**
     * <p>The ID of the dedicated host.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The resource type to query. Valid values:</p>
     * <br>
     * <p>*   Zone: zone.</p>
     * <p>*   IoOptimized: I/O optimized resource.</p>
     * <p>*   InstanceType: instance type.</p>
     * <p>*   SystemDisk: system disk.</p>
     * <p>*   DataDisk: data disk.</p>
     * <p>*   Network: network type.</p>
     * <p>*   ddh: dedicated host.</p>
     * <br>
     * <p>For more information about how to configure the DestinationResource parameter, see the **Description** section of this topic.</p>
     */
    @NameInMap("DestinationResource")
    public String destinationResource;

    /**
     * <p>The billing method of the resource. For more information, see [Billing overview](~~25398~~). Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription.</p>
     * <p>*   PostPaid: pay-as-you-go.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance types. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.</p>
     * <br>
     * <p>For more information about how to configure the InstanceType parameter, see the **Description** section of this topic.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
     * <br>
     * <p>*   none: The instance is a non-I/O optimized instance.</p>
     * <p>*   optimized: The instance is an I/O optimized instance.</p>
     * <br>
     * <p>Default value: optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The memory size of the instance type. Unit: GiB. For more information, see [Instance families](~~25378~~).</p>
     * <br>
     * <p>The Memory parameter takes effect only when the DestinationResource parameter is set to InstanceType.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of the cluster. Valid values:</p>
     * <br>
     * <p>*   vpc</p>
     * <p>*   classic</p>
     */
    @NameInMap("NetworkCategory")
    public String networkCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region for which to query resources. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   instance: ECS instance.</p>
     * <p>*   disk: cloud disk.</p>
     * <p>*   reservedinstance: reserved instance.</p>
     * <p>*   ddh: dedicated host.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values:</p>
     * <br>
     * <p>*   Region: regional.</p>
     * <p>*   Zone: zonal.</p>
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
     * <p>Alibaba Cloud sends ECS system events to notify you 5 minutes before the instance is released. Preemptible instances are billed by the second. We recommend that you specify a protection period based on your business requirements.</p>
     * <br>
     * <p>>If you set SpotStrategy to SpotWithPriceLimit or SpotAsPriceGo, this parameter takes effect.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The bidding policy for pay-as-you-go instances. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     * <br>
     * <p>The SpotStrategy parameter takes effect only when the InstanceChargeType parameter is set to PostPaid.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The category of the system disk. Valid values:</p>
     * <br>
     * <p>*   cloud: basic disk.</p>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: standard SSD.</p>
     * <p>*   ephemeral_ssd: local SSD.</p>
     * <p>*   cloud_essd: enhanced SSD (ESSD).</p>
     * <br>
     * <p>Default value: cloud_efficiency.</p>
     * <br>
     * <p>> When the ResourceType parameter is set to instance and the DestinationResource parameter is set to DataDisk, you must set the SystemDiskCategory parameter. If you do not set this parameter, the default value takes effect.</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The ID of the zone where the instance resides.</p>
     * <br>
     * <p>This parameter is empty by default. When this parameter is empty, the system returns resources that match the other criteria in all zones within the region specified by `RegionId`.</p>
     */
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
