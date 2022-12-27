// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionRequest extends TeaModel {
    @NameInMap("AddAccount")
    public java.util.List<String> addAccount;

    // The ID of the custom image.
    @NameInMap("ImageId")
    public String imageId;

    // Specifies whether to publish the specified custom image as a community image. Valid values:
    // 
    // *   true: publishes the image as a community image. When the image is published, it enters the public state
    // *   false: unpublishes the community image. When the image is unpublished, it enters the private state.
    // 
    // >  If the parameter value is set to `true`, other optional parameters are not allowed to be specified.
    @NameInMap("IsPublic")
    public Boolean isPublic;

    @NameInMap("LaunchPermission")
    public String launchPermission;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveAccount")
    public java.util.List<String> removeAccount;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionRequest self = new ModifyImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionRequest setAddAccount(java.util.List<String> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<String> getAddAccount() {
        return this.addAccount;
    }

    public ModifyImageSharePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageSharePermissionRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public ModifyImageSharePermissionRequest setLaunchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }
    public String getLaunchPermission() {
        return this.launchPermission;
    }

    public ModifyImageSharePermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyImageSharePermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageSharePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageSharePermissionRequest setRemoveAccount(java.util.List<String> removeAccount) {
        this.removeAccount = removeAccount;
        return this;
    }
    public java.util.List<String> getRemoveAccount() {
        return this.removeAccount;
    }

    public ModifyImageSharePermissionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyImageSharePermissionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
