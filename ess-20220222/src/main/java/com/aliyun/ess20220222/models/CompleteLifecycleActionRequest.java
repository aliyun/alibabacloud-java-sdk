// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CompleteLifecycleActionRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request.</p>
     * <p>You can generate a parameter value from your client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The next action to perform after the wait state of the lifecycle hook ends. Valid values:</p>
     * <ul>
     * <li>CONTINUE: Continues the scale-out activity and adds the ECS instance to the scaling group, or continues the scale-in activity and removes the ECS instance from the scaling group.</li>
     * <li>ABANDON: Terminates the scale-out activity and releases the created ECS instance, or continues the scale-in activity and removes the ECS instance from the scaling group.</li>
     * <li>ROLLBACK: Rejects the release of the ECS instance and performs a rollback for a scale-in activity. For a scale-out activity, the effect is the same as ABANDON.</li>
     * </ul>
     * <p>If you do not specify this parameter, the next action after the wait state of the lifecycle hook ends remains the <code>DefaultResult</code> value configured for the lifecycle hook.</p>
     * <p>If multiple lifecycle hooks exist in the scaling group and are triggered simultaneously, the final next action is determined as follows:</p>
     * <ul>
     * <li>For a scale-in activity, when the wait state triggered by an ABANDON or ROLLBACK lifecycle hook ends, the wait states of subsequent lifecycle hooks are ended in advance.</li>
     * <li>If the lifecycle hook that suspends the scale-in activity is of the CONTINUE type, or for a scale-out activity, subsequent lifecycle hooks continue to suspend the scaling activity until the wait state triggered by the last lifecycle hook ends. The final next action is determined by the type of the last lifecycle hook that ends the wait state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTINUE</p>
     */
    @NameInMap("LifecycleActionResult")
    public String lifecycleActionResult;

    /**
     * <p>The identifier of the wait state for the scaling activity. You can obtain this value from the Message Service (MNS) queue or MNS topic specified by the lifecycle hook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaaa-bbbbb-cccc-ddddd</p>
     */
    @NameInMap("LifecycleActionToken")
    public String lifecycleActionToken;

    /**
     * <p>The ID of the lifecycle hook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ash-bp14g3ee6bt3sc98****</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
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
