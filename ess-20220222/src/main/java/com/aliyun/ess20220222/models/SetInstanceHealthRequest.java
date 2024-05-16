// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstanceHealthRequest extends TeaModel {
    /**
     * <p>The health status of the instance. Valid values:</p>
     * <br>
     * <p>*   Healthy: sets the instance as healthy.</p>
     * <p>*   Unhealthy: sets the instance as unhealthy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static SetInstanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceHealthRequest self = new SetInstanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceHealthRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public SetInstanceHealthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
