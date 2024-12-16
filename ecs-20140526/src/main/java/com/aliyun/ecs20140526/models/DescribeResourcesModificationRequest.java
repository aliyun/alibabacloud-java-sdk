// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationRequest extends TeaModel {
    /**
     * <p>The conditions.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<String> conditions;

    /**
     * <p>The number of vCPUs of the instance type. For information about the valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     * <p>This parameter is valid only when the DestinationResource parameter is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The resource type that you want to change. Valid values:</p>
     * <ul>
     * <li><p>InstanceType</p>
     * </li>
     * <li><p>SystemDisk</p>
     * <p>If you set this parameter to SystemDisk, you must specify the InstanceType parameter. In this case, this operation queries the system disk categories supported by the specified instance type.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceType</p>
     */
    @NameInMap("DestinationResource")
    public String destinationResource;

    /**
     * <p>The instance type to which you want to change the instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>. You can also call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
     * <p>If you set the DestinationResource parameter to SystemDisk, you must specify the InstanceType parameter. In this case, this operation queries the system disk categories supported by the specified instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The memory size of the instance type. Unit: GiB. For information about the valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     * <p>This parameter is valid only when the DestinationResource parameter is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>Specifies whether cross-cluster instance type upgrades are supported. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When MigrateAcrossZone is set to true and you upgrade the instance type of an instance based on the returned information, take note of the following items:</p>
     * <ul>
     * <li><p>Instance that resides in the classic network:</p>
     * <ul>
     * <li>For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.</li>
     * <li>For <a href="https://help.aliyun.com/document_detail/25378.html">instance families available for purchase</a>, when the instance type of an instance is changed, the private IP address of the instance changes.</li>
     * </ul>
     * </li>
     * <li><p>Instance that resides in a virtual private cloud (VPC): For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <p>The operation of changing resource configurations.</p>
     * <ul>
     * <li><p>Valid values for subscription resources:</p>
     * <ul>
     * <li>Upgrade: upgrades resources.</li>
     * <li>Downgrade: downgrades resources.</li>
     * <li>RenewDowngrade: renews and downgrades resources.</li>
     * <li>RenewModify: renews an expired instance and changes its configurations.</li>
     * </ul>
     * </li>
     * <li><p>Set the value to Upgrade for pay-as-you-go resources.</p>
     * </li>
     * </ul>
     * <p>Default value: Upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance for which you want to change the instance type or system disk category. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance for which you want to change the instance type or system disk category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the destination zone to which you want to migrate the instance.</p>
     * <p>If you want to change the instance type across zones, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
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
