// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstanceHealthRequest extends TeaModel {
    /**
     * <p>The health status of the ECS instance in the scaling group. If ECS instances do not run as expected, Auto Scaling considers the ECS instances unhealthy. Valid values:</p>
     * <br>
     * <p>*   Healthy</p>
     * <p>*   Unhealthy</p>
     * <br>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
     * <br>
     * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
     * <br>
     * <p>>  Make sure that you have sufficient balance within your Alibaba Cloud account. If you have overdue payments within your Alibaba Cloud account, pay-as-you-go and preemptible instances are stopped or released. For information about how the states of ECS instances change when you have overdue payments within your Alibaba Cloud account, see [Overdue payments](~~170589~~).</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the instance.</p>
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
