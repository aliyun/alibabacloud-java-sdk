// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically release the system disk when the instance from which the system disk is to be detached is released. Valid values:</p>
     * <br>
     * <p>*   true: The system disk is released when the instance is released.</p>
     * <p>*   false: The system disk is not released when the instance is released. The system disk is retained as a pay-as-you-go data disk.</p>
     * <br>
     * <p>Default value: true.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   This parameter cannot be set for disks for which the multi-attach feature is enabled.</p>
     * <p>*   If a data disk is to be detached, the default value is `false`.</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The ID of the disk to be detached.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the ECS instance from which to detach the disk.</p>
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
