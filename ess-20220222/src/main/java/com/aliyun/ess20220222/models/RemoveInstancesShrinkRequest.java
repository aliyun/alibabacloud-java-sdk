// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to modify the expected number of instances. Valid values:</p>
     * <ul>
     * <li>true: After the ECS instances are removed from the scaling group, the expected number of instances is decreased by the number of removed instances.</li>
     * <li>false: After the ECS instances are removed from the scaling group, the expected number of instances remains unchanged.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <p>Specifies whether to ignore invalid instances when removing a batch of instances from the scaling group. Valid values:</p>
     * <ul>
     * <li>true: Invalid instances are ignored when removing a batch of instances from the scaling group. If invalid instances exist and valid instances are successfully removed, the execution status of the scaling activity is displayed as Warning. You can view the invalid instances in the scaling activity details.</li>
     * <li>false: Invalid instances are not ignored when removing a batch of instances from the scaling group. If invalid instances exist in the batch, an error is reported.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreInvalidInstance")
    public Boolean ignoreInvalidInstance;

    /**
     * <p>The IDs of the ECS instances to be removed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The context information of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookContext")
    public String lifecycleHookContextShrink;

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

    /**
     * <p>Specifies the action for the removed ECS instances. Valid values:</p>
     * <ul>
     * <li><p>recycle: The ECS instances are stopped in economical mode.</p>
     * <blockquote>
     * <p>This value takes effect only when <code>ScalingPolicy</code> is set to <code>recycle</code>.</p>
     * </blockquote>
     * </li>
     * <li><p>release: The ECS instances are released.</p>
     * </li>
     * </ul>
     * <p>The ScalingPolicy parameter of CreateScalingGroup specifies the reclaim mode of the scaling group, but the specific action when an instance is removed is determined by the RemovePolicy parameter of RemoveInstances. Examples:</p>
     * <ul>
     * <li>If ScalingPolicy is set to recycle and RemovePolicy is set to recycle, the ECS instances are stopped in economical mode.</li>
     * <li>If ScalingPolicy is set to recycle and RemovePolicy is set to release, the ECS instances are released.</li>
     * <li>If ScalingPolicy is set to release and RemovePolicy is set to recycle, the ECS instances are released.</li>
     * <li>If ScalingPolicy is set to release and RemovePolicy is set to release, the ECS instances are released.</li>
     * </ul>
     * <p>Default value: release.</p>
     * 
     * <strong>example:</strong>
     * <p>release</p>
     */
    @NameInMap("RemovePolicy")
    public String removePolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The timeout period for waiting for the ECS instances to be successfully stopped during the scale-in process. Unit: seconds.
     * Valid values: 30 to 240.</p>
     * <blockquote>
     * <ul>
     * <li>By default, this parameter inherits the value from the scaling group. You can also reset it when calling RemoveInstances.</li>
     * <li>This parameter takes effect only in the scale-in process when RemovePolicy is set to release.  </li>
     * <li>If this parameter is set, the system waits for a maximum of the StopInstanceTimeout period for the instances to be successfully stopped. After the timeout period, the scale-in process continues regardless of whether the instances are successfully stopped.  </li>
     * <li>If this parameter is not set, the system waits for a long time for the instances to be successfully stopped. The scale-in process continues only after the instances are successfully stopped. If the instances fail to be stopped, the scale-in process is rolled back and the scale-in fails.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StopInstanceTimeout")
    public Integer stopInstanceTimeout;

    public static RemoveInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesShrinkRequest self = new RemoveInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveInstancesShrinkRequest setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
        this.decreaseDesiredCapacity = decreaseDesiredCapacity;
        return this;
    }
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    public RemoveInstancesShrinkRequest setIgnoreInvalidInstance(Boolean ignoreInvalidInstance) {
        this.ignoreInvalidInstance = ignoreInvalidInstance;
        return this;
    }
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    public RemoveInstancesShrinkRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RemoveInstancesShrinkRequest setLifecycleHookContextShrink(String lifecycleHookContextShrink) {
        this.lifecycleHookContextShrink = lifecycleHookContextShrink;
        return this;
    }
    public String getLifecycleHookContextShrink() {
        return this.lifecycleHookContextShrink;
    }

    public RemoveInstancesShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveInstancesShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveInstancesShrinkRequest setRemovePolicy(String removePolicy) {
        this.removePolicy = removePolicy;
        return this;
    }
    public String getRemovePolicy() {
        return this.removePolicy;
    }

    public RemoveInstancesShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveInstancesShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveInstancesShrinkRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public RemoveInstancesShrinkRequest setStopInstanceTimeout(Integer stopInstanceTimeout) {
        this.stopInstanceTimeout = stopInstanceTimeout;
        return this;
    }
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
    }

}
