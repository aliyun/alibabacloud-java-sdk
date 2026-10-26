// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to release the system cloud disk or data cloud disk when the ECS instance is released. This parameter sets the automatic release attribute when you unmount a system cloud disk or data cloud disk.</p>
     * <ul>
     * <li>true: The disk is released.</li>
     * <li>false: The disk is not released. The cloud disk is converted to a pay-as-you-go data cloud disk and is retained.</li>
     * </ul>
     * <p>Default value: true.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This parameter cannot be set for cloud disks that have the multi-attach feature enabled.</li>
     * <li>If you unmount a data cloud disk, the default value is <code>false</code>.</li>
     * <li>If the disk to be unmounted is an elastic ephemeral disk, you must set the <code>DeleteWithInstance</code> parameter to <code>true</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The ID of the disk to be unmounted.</p>
     * <ul>
     * <li><p>The disk must be mounted to an instance and be in the In Use (<code>In_use</code>) state.</p>
     * </li>
     * <li><p>When you unmount a data cloud disk, the instance to which the disk is mounted must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</p>
     * </li>
     * <li><p>When you unmount a system cloud disk, the instance to which the disk is mounted must be in the Stopped (<code>Stopped</code>) state.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The instance ID of the ECS instance to which the disk to be uninstalled is attached.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DetachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskRequest self = new DetachDiskRequest();
        return TeaModel.build(map, self);
    }

    public DetachDiskRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public DetachDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DetachDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DetachDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
