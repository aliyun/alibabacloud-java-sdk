// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyOrderAutoRebootTimeRequest extends TeaModel {
    @NameInMap("AutoRebootTime")
    public String autoRebootTime;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyOrderAutoRebootTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderAutoRebootTimeRequest self = new ModifyOrderAutoRebootTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOrderAutoRebootTimeRequest setAutoRebootTime(String autoRebootTime) {
        this.autoRebootTime = autoRebootTime;
        return this;
    }
    public String getAutoRebootTime() {
        return this.autoRebootTime;
    }

    public ModifyOrderAutoRebootTimeRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyOrderAutoRebootTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyOrderAutoRebootTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOrderAutoRebootTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyOrderAutoRebootTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
