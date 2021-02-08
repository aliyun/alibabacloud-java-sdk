// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeRequest extends TeaModel {
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

    @NameInMap("StorageCapacityUnitId")
    @Validation(required = true)
    public String storageCapacityUnitId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyStorageCapacityUnitAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeRequest self = new ModifyStorageCapacityUnitAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyStorageCapacityUnitAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyStorageCapacityUnitAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyStorageCapacityUnitAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyStorageCapacityUnitAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStorageCapacityUnitAttributeRequest setStorageCapacityUnitId(String storageCapacityUnitId) {
        this.storageCapacityUnitId = storageCapacityUnitId;
        return this;
    }
    public String getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

    public ModifyStorageCapacityUnitAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyStorageCapacityUnitAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
