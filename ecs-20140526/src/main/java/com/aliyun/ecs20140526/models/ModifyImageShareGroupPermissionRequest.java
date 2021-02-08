// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageShareGroupPermissionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("AddGroup")
    public java.util.List<String> addGroup;

    @NameInMap("RemoveGroup")
    public java.util.List<String> removeGroup;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyImageShareGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareGroupPermissionRequest self = new ModifyImageShareGroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareGroupPermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageShareGroupPermissionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyImageShareGroupPermissionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyImageShareGroupPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageShareGroupPermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageShareGroupPermissionRequest setAddGroup(java.util.List<String> addGroup) {
        this.addGroup = addGroup;
        return this;
    }
    public java.util.List<String> getAddGroup() {
        return this.addGroup;
    }

    public ModifyImageShareGroupPermissionRequest setRemoveGroup(java.util.List<String> removeGroup) {
        this.removeGroup = removeGroup;
        return this;
    }
    public java.util.List<String> getRemoveGroup() {
        return this.removeGroup;
    }

    public ModifyImageShareGroupPermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
