// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationRequest extends TeaModel {
    /**
     * <p>The condition. If you specify this parameter, the system queries the resource types that the resource can be changed to after the resource meets the specified condition.</p>
     * <br>
     * <p>Set the value to DiskCategory, which indicates a disk category change. When you set this parameter to DiskCategory, the system queries the instance types that the instance can be changed to after a disk category change.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<String> conditions;

    /**
     * <p>The number of vCPU cores of the instance type. For information about the values, see [Overview of instance families](~~25378~~). This parameter takes effect only when DestinationResource is set to InstanceType.</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The target resource type. Valid values:</p>
     * <br>
     * <p>*   InstanceType</p>
     * <p>*   SystemDisk</p>
     */
    @NameInMap("DestinationResource")
    public String destinationResource;

    /**
     * <p>The instance type. For more information, see [Overview of instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list. This parameter is required when DestinationResource is set to SystemDisk.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The memory size of the instance type. Unit: GiB. For information about the values, see [Overview of instance families](~~25378~~). This parameter takes effect only when DestinationResource is set to InstanceType.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>Specifies whether cross-cluster instance type upgrades are supported. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>When MigrateAcrossZone is set to true and you upgrade the instance type of an Elastic Compute Service (ECS) instance based on the returned information, take note of the following items:</p>
     * <br>
     * <p>*   Instances that reside in the classic network:</p>
     * <br>
     * <p>    *   For [retired instance types](~~55263~~), when a non-I/O-optimized instance is upgraded to an I/O-optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For Linux instances, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.</p>
     * <p>    *   For [instance families available for purchase](~~25378~~), when the instance type of an instance is changed, the private IP address of the instance changes.</p>
     * <br>
     * <p>*   Instances that reside in virtual private clouds (VPCs): For [retired instance types](~~55263~~), when a non-I/O-optimized instance is upgraded to an I/O-optimized instance, the disk device names and software authorization codes of the instance change. For Linux instances, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <p>The operation of changing resource configurations.</p>
     * <br>
     * <p>*   Valid values for subscription resources:</p>
     * <br>
     * <p>    *   Upgrade</p>
     * <p>    *   Downgrade</p>
     * <p>    *   RenewDowngrade</p>
     * <p>    *   RenewModify</p>
     * <br>
     * <p>*   Valid values for pay-as-you-go resources: Upgrade</p>
     * <br>
     * <p>Default value: Upgrade.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource. For example, when DestinationResource is set to InstanceType, this parameter can be interpreted as InstanceId.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeResourcesModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationRequest self = new DescribeResourcesModificationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesModificationRequest setConditions(java.util.List<String> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<String> getConditions() {
        return this.conditions;
    }

    public DescribeResourcesModificationRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeResourcesModificationRequest setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public String getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeResourcesModificationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeResourcesModificationRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeResourcesModificationRequest setMigrateAcrossZone(Boolean migrateAcrossZone) {
        this.migrateAcrossZone = migrateAcrossZone;
        return this;
    }
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    public DescribeResourcesModificationRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeResourcesModificationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourcesModificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourcesModificationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourcesModificationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeResourcesModificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourcesModificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourcesModificationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
