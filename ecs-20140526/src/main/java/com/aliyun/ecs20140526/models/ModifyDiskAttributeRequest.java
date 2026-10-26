// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the performance burst feature for a cloud disk that supports this feature. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * <blockquote>
     * <p>An error is returned if you specify this parameter for a cloud disk that does not support the performance burst feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether to delete the automatic snapshots of the cloud disk when the cloud disk is deleted. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: null. A value of null indicates that the current value is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether to release the cloud disk when the instance is released. Default value: null. A value of null indicates that the current value is not changed.</p>
     * <p>&lt;props=&quot;china&quot;&gt;This parameter is not supported for cloud disks that have the multi-attach feature enabled.</p>
     * <p>An error is returned if you set the <code>DeleteWithInstance</code> parameter to <code>false</code> in the following scenarios: </p>
     * <ul>
     * <li>The category of the cloud disk is local disk (ephemeral).  </li>
     * <li>The category of the cloud disk is basic cloud disk (cloud) and the cloud disk is not removable (Portable=false).</li>
     * </ul>
     * <blockquote>
     * <p>Warning: If you set this parameter to false, the cloud disk is not released when the instance is released. However, if the ECS instance to which the cloud disk is attached is locked for security reasons and the &quot;LockReason&quot; : &quot;security&quot; state is added to OperationLocks, the DeleteWithInstance attribute of the cloud disk is ignored and the cloud disk is released along with the instance.</warning></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The description of the cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud disk whose attributes you want to modify.</p>
     * <blockquote>
     * <p>You cannot specify both the <code>DiskId</code> and <code>DiskIds.N</code> parameters. Specify one of them based on your business requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1famypsnar20bv****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The IDs of the cloud disks whose attributes you want to modify. Valid values of N: 0 to 100.</p>
     * <blockquote>
     * <p>You cannot specify both the <code>DiskId</code> and <code>DiskIds.N</code> parameters. Specify one of them based on your business requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1famypsnar20bv****</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The name of the cloud disk. The name must be 2 to 128 characters in length and can contain letters and digits in Unicode. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to enable the automatic snapshot policy feature for the cloud disk. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: null. A value of null indicates that the current value is not changed.</p>
     * <blockquote>
     * <p>This parameter is deprecated. The automatic snapshot policy feature is enabled by default for newly created cloud disks. You only need to apply an automatic snapshot policy to the cloud disk to use the feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static ModifyDiskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeRequest self = new ModifyDiskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskAttributeRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyDiskAttributeRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public ModifyDiskAttributeRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public ModifyDiskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskAttributeRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyDiskAttributeRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public ModifyDiskAttributeRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public ModifyDiskAttributeRequest setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
        this.enableAutoSnapshot = enableAutoSnapshot;
        return this;
    }
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public ModifyDiskAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDiskAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDiskAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDiskAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
