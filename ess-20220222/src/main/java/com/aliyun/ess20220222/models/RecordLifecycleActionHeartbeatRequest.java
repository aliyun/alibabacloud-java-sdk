// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RecordLifecycleActionHeartbeatRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The time window during which the desired ECS instance stays in a Pending state. When the time window ends, Auto Scaling executes the default action. Valid values: 30 to 21600. Unit: seconds.</p>
     * <p>After you create a lifecycle hook, you can call this operation to extend the time window during which the desired ECS instance stays in a Pending state. You can also call the <a href="https://help.aliyun.com/document_detail/459335.html">CompleteLifecycleAction</a> operation to remove the desired ECS instance from a Pending state ahead of schedule.</p>
     * <p>Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("heartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The action token of the lifecycle hook. You can obtain the token from the details page of the Message Service (MNS) queue specified for the lifecycle hook when the desired ECS instance enters a Pending state.\
     * You can also call the <a href="https://help.aliyun.com/document_detail/459333.html">DescribeLifecycleActions</a> operation to obtain the action token of the lifecycle hook.\
     * If you specified an MNS topic for the lifecycle hook, you can obtain the token from the MNS topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F324B880-900E-4968-85DD-81691113****</p>
     */
    @NameInMap("lifecycleActionToken")
    public String lifecycleActionToken;

    /**
     * <p>The ID of the lifecycle hook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ash-bp1fxuqyi98w0aib****</p>
     */
    @NameInMap("lifecycleHookId")
    public String lifecycleHookId;

    public static RecordLifecycleActionHeartbeatRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordLifecycleActionHeartbeatRequest self = new RecordLifecycleActionHeartbeatRequest();
        return TeaModel.build(map, self);
    }

    public RecordLifecycleActionHeartbeatRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RecordLifecycleActionHeartbeatRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RecordLifecycleActionHeartbeatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RecordLifecycleActionHeartbeatRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RecordLifecycleActionHeartbeatRequest setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    public RecordLifecycleActionHeartbeatRequest setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
        return this;
    }
    public String getLifecycleActionToken() {
        return this.lifecycleActionToken;
    }

    public RecordLifecycleActionHeartbeatRequest setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

}
