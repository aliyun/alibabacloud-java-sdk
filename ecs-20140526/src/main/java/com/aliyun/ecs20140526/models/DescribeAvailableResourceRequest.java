// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The number of vCPUs of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * <p>The Cores parameter takes effect only when the DestinationResource parameter is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The category of the data disk. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk</li>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>ephemeral_ssd: local SSD</li>
     * <li>cloud_essd: ESSD</li>
     * <li>cloud_auto: ESSD AutoPL disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    /**
     * <p>The ID of the dedicated host.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The resource type to query. Valid values:</p>
     * <ul>
     * <li>Zone: zone.</li>
     * <li>IoOptimized: I/O optimized resource.</li>
     * <li>InstanceType: instance type.</li>
     * <li>SystemDisk: system disk.</li>
     * <li>DataDisk: data disk.</li>
     * <li>Network: network type.</li>
     * <li>ddh: dedicated host.</li>
     * </ul>
     * <p>For more information about how to configure the DestinationResource parameter, see the <strong>Description</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceType</p>
     */
    @NameInMap("DestinationResource")
    public String destinationResource;

    /**
     * <p>The billing method of the resource. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
     * <p>For more information about how to configure the InstanceType parameter, see the <strong>Description</strong> section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is a non-I/O optimized instance.</li>
     * <li>optimized: The instance is an I/O optimized instance.</li>
     * </ul>
     * <p>Default value: optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The memory size of the instance type. Unit: GiB. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * <p>The Memory parameter takes effect only when the DestinationResource parameter is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type of the cluster. Valid values:</p>
     * <ul>
     * <li>vpc</li>
     * <li>classic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkCategory")
    public String networkCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region for which to query resources. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li>instance: ECS instance.</li>
     * <li>disk: cloud disk.</li>
     * <li>reservedinstance: reserved instance.</li>
     * <li>ddh: dedicated host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The scope of the reserved instance. Valid values:</p>
     * <ul>
     * <li>Region: regional.</li>
     * <li>Zone: zonal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Spot instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * <blockquote>
     * <p> This parameter takes effect only if SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
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
     * <li>NoSpot: The instance is a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is a spot instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is a spot instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * <p>The SpotStrategy parameter takes effect only when the InstanceChargeType parameter is set to PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

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
     * <p>Default value: cloud_efficiency.</p>
     * <blockquote>
     * <p> This parameter must be specified when ResourceType is set to instance and DestinationResource is set to DataDisk. If you do not specify this parameter, the default value takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The ID of the zone where the instance resides.</p>
     * <p>This parameter is empty by default. When this parameter is empty, the system returns resources that match the other criteria in all zones within the region specified by <code>RegionId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
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
