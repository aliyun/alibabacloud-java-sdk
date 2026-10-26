// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageShareGroupPermissionRequest extends TeaModel {
    @NameInMap("AddGroup")
    public java.util.List<String> addGroup;

    @NameInMap("RemoveGroup")
    public java.util.List<String> removeGroup;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1a2b3c4d5e6f7g</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call DescribeRegions to query available regions.</p>
     * <p>This parameter is required.</p>
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

    public static ModifyImageShareGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareGroupPermissionRequest self = new ModifyImageShareGroupPermissionRequest();
        return TeaModel.build(map, self);
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

    public ModifyImageShareGroupPermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageShareGroupPermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyImageShareGroupPermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageShareGroupPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
