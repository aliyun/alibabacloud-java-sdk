// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationRequest extends TeaModel {
    /**
     * <p>The list of conditions.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<String> conditions;

    /**
     * <p>The number of vCPU kernels of the target instance type. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * <p>This parameter takes effect only when DestinationResource is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The type of the resource to be changed. Valid values: </p>
     * <ul>
     * <li><p>InstanceType: instance type.</p>
     * </li>
     * <li><p>SystemDisk: system disk type.</p>
     * <p>If you set this parameter to SystemDisk, you must also specify the InstanceType parameter to indicate the disk type required by the target instance type.</p>
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
     * <p>The target instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * <p>If DestinationResource is set to SystemDisk, you must also specify the InstanceType parameter to indicate the disk type required by the target instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The memory size of the target instance type. Unit: GiB. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * <p>This parameter takes effect only when DestinationResource is set to InstanceType.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>Specifies whether cross-cluster instance type changes are supported. Valid values: </p>
     * <ul>
     * <li>true: Supported.</li>
     * <li>false: Not supported.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If the MigrateAcrossZone parameter is set to true and you upgrade or downgrade the Elastic Compute Service instance based on the returned information, take note of the following items: </p>
     * <ul>
     * <li>VPC-type instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device names and software authorization codes of the server are changed. For Linux instances, basic disks (cloud) are identified as xvda or xvdb. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vda or vdb.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <p>The type of the Upgrade/Downgrade operation.</p>
     * <ul>
     * <li><p>Valid values for subscription resources: </p>
     * <ul>
     * <li>Upgrade: upgrades resources.</li>
     * <li>Downgrade: downgrades resources.</li>
     * <li>RenewDowngrade: downgrades resources upon renewal.</li>
     * <li>RenewModify: renewal with specification change for expired instances.</li>
     * </ul>
     * </li>
     * <li><p>Valid value for pay-as-you-go resources: Upgrade.</p>
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
     * <p>The region ID of the instance whose configuration you want to change. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID (InstanceId) of the instance whose instance type or system disk type you want to change.</p>
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
     * <p>The ID of the target zone.</p>
     * <p>Specify this parameter when you want to change the instance type across zones.</p>
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
