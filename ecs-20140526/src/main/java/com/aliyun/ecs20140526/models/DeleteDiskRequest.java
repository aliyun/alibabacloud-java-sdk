// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk that you want to release.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskRequest self = new DeleteDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DeleteDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
