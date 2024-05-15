// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionRequest extends TeaModel {
    /**
     * <p>The ID of Alibaba Cloud account N to which you want to share the custom image. Valid values of N: 1 to 10. If you specify more than 10 Alibaba Cloud account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.</p>
     */
    @NameInMap("AddAccount")
    public java.util.List<String> addAccount;

    /**
     * <p>The ID of the custom image.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Specifies whether to publish or unpublish a community image. Valid values:</p>
     * <br>
     * <p>*   true: publishes the custom image as a community image.</p>
     * <p>*   false: unpublishes a community image. The unpublish operation takes effect only on community images.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IsPublic")
    public Boolean isPublic;

    /**
     * <p>> This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("LaunchPermission")
    public String launchPermission;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the custom image. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of Alibaba Cloud account N from which you want to unshare the custom image. Valid values of N: 1 to 10. If you specify more than 10 Alibaba Cloud account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.</p>
     */
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
