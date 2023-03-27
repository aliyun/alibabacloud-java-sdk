// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeRequest extends TeaModel {
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDedicatedHostClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeRequest self = new ModifyDedicatedHostClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyDedicatedHostClusterAttributeRequest setDedicatedHostClusterName(String dedicatedHostClusterName) {
        this.dedicatedHostClusterName = dedicatedHostClusterName;
        return this;
    }
    public String getDedicatedHostClusterName() {
        return this.dedicatedHostClusterName;
    }

    public ModifyDedicatedHostClusterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDedicatedHostClusterAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDedicatedHostClusterAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostClusterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostClusterAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostClusterAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
