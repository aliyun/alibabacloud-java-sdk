// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SetInstanceHealthRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("HealthStatus")
    public String healthStatus;

    public static SetInstanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceHealthRequest self = new SetInstanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceHealthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetInstanceHealthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetInstanceHealthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetInstanceHealthRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

}
