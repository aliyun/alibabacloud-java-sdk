// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeRequest extends TeaModel {
    /**
     * <p>The new description of the SCU. The description must be 2 to 256 characters in length and cannot start with [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with [http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).](http://https://。、（:）、（_）（-）。)</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the SCU. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SCU.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageCapacityUnitId")
    public String storageCapacityUnitId;

    public static ModifyStorageCapacityUnitAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeRequest self = new ModifyStorageCapacityUnitAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyStorageCapacityUnitAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyStorageCapacityUnitAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyStorageCapacityUnitAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyStorageCapacityUnitAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ModifyStorageCapacityUnitAttributeRequest setStorageCapacityUnitId(String storageCapacityUnitId) {
        this.storageCapacityUnitId = storageCapacityUnitId;
        return this;
    }
    public String getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

}
