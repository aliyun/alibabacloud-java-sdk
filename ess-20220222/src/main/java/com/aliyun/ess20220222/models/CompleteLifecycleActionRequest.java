// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CompleteLifecycleActionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The action that you want Auto Scaling to perform after the lifecycle hook ends. Valid values:</p>
     * <br>
     * <p>*   CONTINUE: Auto Scaling continues to add Elastic Compute Service (ECS) instances to the scaling group, or continues to remove ECS instances from the scaling group.</p>
     * <p>*   ABANDON: Auto Scaling stops adding ECS instances to the scaling group and releases the ECS instances, or continues to respond to scale-in requests and remove ECS instances from the scaling group.</p>
     * <br>
     * <p>Default value: CONTINUE.</p>
     * <br>
     * <p>If multiple lifecycle hooks exist in a scaling group and are triggered at the same time, the following rules apply:</p>
     * <br>
     * <p>*   If you set the LifecycleActionResult parameter to ABANDON for the lifecycle hook that is applied to a scale-in activity, Auto Scaling immediately removes ECS instances from the scaling group after the lifecycle hook ends, without the need to wait for the last lifecycle hook to end.</p>
     * <p>*   If you set the LifecycleActionResult parameter to CONTINUE for the lifecycle hook that is applied to a scale-in or scale-out activity, Auto Scaling performs the next action until the last lifecycle hook in the scaling group ends. The action that Auto Scaling performs varies based on the value that you specify for the LifecycleActionResult parameter of the last lifecycle hook.</p>
     */
    @NameInMap("LifecycleActionResult")
    public String lifecycleActionResult;

    /**
     * <p>The token of the lifecycle hook. You can obtain this token by using a Message Service (MNS) queue or an MNS topic that is specified for the lifecycle hook.</p>
     */
    @NameInMap("LifecycleActionToken")
    public String lifecycleActionToken;

    /**
     * <p>The ID of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

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

    public static CompleteLifecycleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteLifecycleActionRequest self = new CompleteLifecycleActionRequest();
        return TeaModel.build(map, self);
    }

    public CompleteLifecycleActionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CompleteLifecycleActionRequest setLifecycleActionResult(String lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
        return this;
    }
    public String getLifecycleActionResult() {
        return this.lifecycleActionResult;
    }

    public CompleteLifecycleActionRequest setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
        return this;
    }
    public String getLifecycleActionToken() {
        return this.lifecycleActionToken;
    }

    public CompleteLifecycleActionRequest setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    public CompleteLifecycleActionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CompleteLifecycleActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompleteLifecycleActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CompleteLifecycleActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
