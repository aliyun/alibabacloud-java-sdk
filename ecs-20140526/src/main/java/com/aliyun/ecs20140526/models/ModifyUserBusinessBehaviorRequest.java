// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyUserBusinessBehaviorRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("statusKey")
    public String statusKey;

    @NameInMap("statusValue")
    public String statusValue;

    public static ModifyUserBusinessBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserBusinessBehaviorRequest self = new ModifyUserBusinessBehaviorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserBusinessBehaviorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUserBusinessBehaviorRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyUserBusinessBehaviorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyUserBusinessBehaviorRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyUserBusinessBehaviorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserBusinessBehaviorRequest setStatusKey(String statusKey) {
        this.statusKey = statusKey;
        return this;
    }
    public String getStatusKey() {
        return this.statusKey;
    }

    public ModifyUserBusinessBehaviorRequest setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }
    public String getStatusValue() {
        return this.statusValue;
    }

}
