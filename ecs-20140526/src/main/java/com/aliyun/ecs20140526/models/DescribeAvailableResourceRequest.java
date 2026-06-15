// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The number of vCPU cores for the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * <p>This parameter applies only when <code>DestinationResource</code> is set to <code>InstanceType</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The category of the data disk. Valid values:</p>
     * <ul>
     * <li><p>cloud: basic cloud disk.</p>
     * </li>
     * <li><p>cloud_efficiency: ultra cloud disk.</p>
     * </li>
     * <li><p>cloud_ssd: SSD cloud disk.</p>
     * </li>
     * <li><p>ephemeral_ssd: local SSD disk.</p>
     * </li>
     * <li><p>cloud_essd: ESSD cloud disk.</p>
     * </li>
     * <li><p>cloud_auto: ESSD AutoPL cloud disk.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>cloud_essd_entry: ESSD Entry cloud disk.</li>
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
     * <p>The type of resource to query. Valid values:</p>
     * <ul>
     * <li><p>Zone: availability zone.</p>
     * </li>
     * <li><p>IoOptimized: I/O optimized.</p>
     * </li>
     * <li><p>InstanceType: instance type.</p>
     * </li>
     * <li><p>Network: network type.</p>
     * </li>
     * <li><p>ddh: dedicated host.</p>
     * </li>
     * <li><p>SystemDisk: system disk.</p>
     * </li>
     * <li><p>DataDisk: data disk.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When <code>DestinationResource</code> is set to <code>SystemDisk</code>, you must specify <code>InstanceType</code> because available system disks depend on the instance type.</p>
     * </blockquote>
     * <p>For details on how to specify this parameter, see the <strong>API description</strong> section.</p>
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
     * <li><p>PrePaid: The subscription billing method.</p>
     * </li>
     * <li><p>PostPaid: The pay-as-you-go billing method.</p>
     * </li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>. You can also call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to get the latest list of instance types.</p>
     * <p>For details on how to specify this parameter, see the <strong>API description</strong> section.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li><p>none: The instance is not I/O optimized.</p>
     * </li>
     * <li><p>optimized: The instance is I/O optimized.</p>
     * </li>
     * </ul>
     * <p>Default value: optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The memory size for the instance type, in GiB. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * <p>This parameter applies only when <code>DestinationResource</code> is set to <code>InstanceType</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><p>vpc: VPC.</p>
     * </li>
     * <li><p>classic: classic network.</p>
     * </li>
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
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to get the latest list of Alibaba Cloud regions.</p>
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
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>instance: ECS instance.</p>
     * </li>
     * <li><p>disk: cloud disk.</p>
     * </li>
     * <li><p>reservedinstance: reserved instance.</p>
     * </li>
     * <li><p>ddh: dedicated host.</p>
     * </li>
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
     * <li><p>Region: The reserved instance is scoped to a region.</p>
     * </li>
     * <li><p>Zone: The reserved instance is scoped to an availability zone.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The protection period for the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p>1: Alibaba Cloud guarantees that the instance will not be automatically reclaimed within 1 hour of creation. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or reclaim the instance.</p>
     * </li>
     * <li><p>0: Alibaba Cloud does not guarantee that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or reclaim the instance.</p>
     * </li>
     * </ul>
     * <p>Alibaba Cloud sends a notification through ECS system events 5 minutes before reclaiming an instance. Spot instances are billed by the second. We recommend that you select a protection period based on the expected runtime of your tasks.</p>
     * <blockquote>
     * <p>This parameter applies only when <code>InstanceChargeType</code> is set to <code>PostPaid</code> and <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code> or <code>SpotAsPriceGo</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The bidding strategy for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><p>NoSpot: A standard pay-as-you-go instance.</p>
     * </li>
     * <li><p>SpotWithPriceLimit: A spot instance for which you specify a maximum hourly price.</p>
     * </li>
     * <li><p>SpotAsPriceGo: A spot instance for which the system automatically bids based on the current market price, up to the pay-as-you-go price.</p>
     * </li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * <p>This parameter applies only when <code>InstanceChargeType</code> is set to <code>PostPaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The category of the system disk. Valid values:</p>
     * <ul>
     * <li><p>cloud: basic cloud disk.</p>
     * </li>
     * <li><p>cloud_efficiency: ultra cloud disk.</p>
     * </li>
     * <li><p>cloud_ssd: SSD cloud disk.</p>
     * </li>
     * <li><p>ephemeral_ssd: local SSD disk.</p>
     * </li>
     * <li><p>cloud_essd: ESSD cloud disk.</p>
     * </li>
     * <li><p>cloud_auto: ESSD AutoPL cloud disk.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>cloud_essd_entry: ESSD Entry cloud disk.</li>
     * </ul>
     * <p>About the default value:</p>
     * <ul>
     * <li><p>If <code>InstanceType</code> specifies a discontinued instance type, the default value is <code>cloud</code>.</p>
     * </li>
     * <li><p>Otherwise, the default value is <code>cloud_efficiency</code>. &lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only ESSD cloud disks, the default value changes from cloud_efficiency to cloud_essd PL0. For more information, see the <a href="https://www.aliyun.com/notice/117844">official announcement</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When <code>ResourceType</code> is set to <code>instance</code> and <code>DestinationResource</code> is set to <code>DataDisk</code>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The ID of the availability zone.</p>
     * <p>This parameter has no default value. If you do not specify this parameter, the operation returns resources that meet the query conditions in all availability zones within the specified region.</p>
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
