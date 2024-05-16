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
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The period of time before the lifecycle hook ends. Auto Scaling performs the specified action after the lifecycle hook ends. Valid values: 30 to 21600. Unit: seconds.</p>
     * <br>
     * <p>You can call this operation to prolong the length of a lifecycle hook. You can also call the CompleteLifecycleAction operation to end a lifecycle hook ahead of schedule.</p>
     * <br>
     * <p>Default value: 600.</p>
     */
    @NameInMap("heartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The token of the lifecycle hook. You can obtain this token by using a Message Service (MNS) queue or an MNS topic that is specified for the lifecycle hook.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("lifecycleActionToken")
    public String lifecycleActionToken;

    /**
     * <p>The ID of the lifecycle hook.</p>
     * <br>
     * <p>This parameter is required.</p>
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
