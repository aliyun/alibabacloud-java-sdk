// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacePermissionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfacePermissionId")
    @Validation(required = true)
    public String networkInterfacePermissionId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteNetworkInterfacePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacePermissionRequest self = new DeleteNetworkInterfacePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacePermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteNetworkInterfacePermissionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteNetworkInterfacePermissionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteNetworkInterfacePermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteNetworkInterfacePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkInterfacePermissionRequest setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
        return this;
    }
    public String getNetworkInterfacePermissionId() {
        return this.networkInterfacePermissionId;
    }

    public DeleteNetworkInterfacePermissionRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
