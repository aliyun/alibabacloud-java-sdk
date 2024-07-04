// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CompleteLifecycleActionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The action that you want Auto Scaling to perform after the lifecycle hook times out. Valid values:</p>
     * <ul>
     * <li>CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.</li>
     * <li>ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities or removes ECS instances from the scaling group during scale-in activities.</li>
     * <li>ROLLBACK: For scale-in activities, Auto Scaling rejects the requests to release ECS instances but rolls back ECS instances. For scale-out activities, the ROLLBACK setting has the same effect as the ABANDON setting.</li>
     * </ul>
     * <p>If you do not specify this parameter, Auto Scaling performs the action that is specified by the <code>DefaultResult</code> parameter after the lifecycle hook times out.</p>
     * <p>If multiple lifecycle hooks exist in a scaling group and the lifecycle hooks are triggered at the same time, the following rules apply:</p>
     * <ul>
     * <li>For scale-in activities, when lifecycle hooks whose LifecycleActionResult parameter is set to ABANDON or ROLLBACK time out, other lifecycle hooks time out ahead of schedule.</li>
     * <li>For scale-in and scale-out activities, if you set the LifecycleActionResult parameter for all lifecycle hooks to CONTINUE, Auto Scaling performs the next action only after the last lifecycle hook times out. The action that Auto Scaling performs varies based on the value that you specify for the LifecycleActionResult parameter of the lifecycle hook that last times out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTINUE</p>
     */
    @NameInMap("LifecycleActionResult")
    public String lifecycleActionResult;

    /**
     * <p>The token of the lifecycle hook. You can obtain this token by using a Message Service (MNS) queue or an MNS topic that is specified for the lifecycle hook.</p>
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
