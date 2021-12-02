// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateImageAttributeRequest extends TeaModel {
    @NameInMap("AddAccount")
    public java.util.List<String> addAccount;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveAccount")
    public java.util.List<String> removeAccount;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageAttributeRequest self = new UpdateImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageAttributeRequest setAddAccount(java.util.List<String> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<String> getAddAccount() {
        return this.addAccount;
    }

    public UpdateImageAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateImageAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UpdateImageAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateImageAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateImageAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateImageAttributeRequest setRemoveAccount(java.util.List<String> removeAccount) {
        this.removeAccount = removeAccount;
        return this;
    }
    public java.util.List<String> getRemoveAccount() {
        return this.removeAccount;
    }

    public UpdateImageAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateImageAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
