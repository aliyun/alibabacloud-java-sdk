// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable performance burst for the disk if the disk supports performance burst. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> An error is reported if you specify this parameter for a disk that does not support performance burst.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether to delete the automatic snapshots of the disk when the disk is released. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether to release the disk together with the associated instance. This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     * <p>An error is returned if you set <code>DeleteWithInstance</code> to <code>false</code> in one of the following cases:</p>
     * <ul>
     * <li>The disk is a local disk.</li>
     * <li>The disk is a basic disk and is not removable. If the Portable attribute of a disk is set to false, the disk is not removable.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Warning</strong> If you set DeleteWithInstance to false and the instance to which the disk is attached is locked for security reasons, the DeleteWithInstance attribute of the disk is ignored and the disk is released together with the instance. If &quot;LockReason&quot; : &quot;security&quot; is displayed in the response when you query information about an instance, the instance is locked for security reasons.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The description of the disk. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the disk whose attributes you want to modify.</p>
     * <blockquote>
     * <p> You can specify <code>DiskId</code> or <code>DiskIds.N</code>, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1famypsnar20bv****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The IDs of the disks whose attributes you want to modify. Valid values of N: 0 to 100.</p>
     * <blockquote>
     * <p> You can specify <code>DiskId</code> or <code>DiskIds.N</code>, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1famypsnar20bv****</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to enable the automatic snapshot policy feature for the disk. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     * <blockquote>
     * <p> By default, the automatic snapshot policy feature is enabled for cloud disks. You need to only apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.</p>
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
     * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
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
