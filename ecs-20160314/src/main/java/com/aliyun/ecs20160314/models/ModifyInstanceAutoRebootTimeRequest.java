// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRebootTimeRequest extends TeaModel {
    @NameInMap("AutoRebootTime")
    public String autoRebootTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceAutoRebootTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRebootTimeRequest self = new ModifyInstanceAutoRebootTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRebootTimeRequest setAutoRebootTime(String autoRebootTime) {
        this.autoRebootTime = autoRebootTime;
        return this;
    }
    public String getAutoRebootTime() {
        return this.autoRebootTime;
    }

    public ModifyInstanceAutoRebootTimeRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstanceAutoRebootTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAutoRebootTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAutoRebootTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAutoRebootTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
