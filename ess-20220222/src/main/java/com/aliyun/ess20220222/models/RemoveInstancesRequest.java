// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure request idempotence. This token must be unique for each request, contain only ASCII characters, and not exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to decrease the desired capacity of the scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Decreases the desired capacity of the scaling group by the number of removed instances.</p>
     * </li>
     * <li><p><code>false</code>: The desired capacity of the scaling group remains unchanged.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <p>Specifies whether to ignore invalid instances when you remove multiple instances from a scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Invalid instances are ignored. If valid instances are removed while invalid ones are present, the scaling activity status is set to Warning. The invalid instances are listed in the scaling activity details.</p>
     * </li>
     * <li><p><code>false</code>: The request is rejected and an error is returned if it contains any invalid instances.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreInvalidInstance")
    public Boolean ignoreInvalidInstance;

    /**
     * <p>The IDs of the ECS instances to remove.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The context of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookContext")
    public RemoveInstancesRequestLifecycleHookContext lifecycleHookContext;

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
     * <p>Specifies the action to take on removed ECS instances. Valid values:</p>
     * <ul>
     * <li><p>recycle: The ECS instances enter the economical mode.</p>
     * <blockquote>
     * <p>This value takes effect only when the <code>ScalingPolicy</code> parameter of the scaling group is set to <code>recycle</code>.</p>
     * </blockquote>
     * </li>
     * <li><p>release: The ECS instances are released.</p>
     * </li>
     * </ul>
     * <p>The <code>ScalingPolicy</code> parameter of the <code>CreateScalingGroup</code> operation specifies the reclamation mode of a scaling group. However, the <code>RemovePolicy</code> parameter of the <code>RemoveInstances</code> operation determines the action taken when an instance is removed. For example:</p>
     * <ul>
     * <li><p>If <code>ScalingPolicy</code> is <code>recycle</code> and <code>RemovePolicy</code> is <code>recycle</code>, the ECS instances enter the economical mode.</p>
     * </li>
     * <li><p>If <code>ScalingPolicy</code> is <code>recycle</code> and <code>RemovePolicy</code> is <code>release</code>, the ECS instances are released.</p>
     * </li>
     * <li><p>If <code>ScalingPolicy</code> is <code>release</code> and <code>RemovePolicy</code> is <code>recycle</code>, the ECS instances are released.</p>
     * </li>
     * <li><p>If <code>ScalingPolicy</code> is <code>release</code> and <code>RemovePolicy</code> is <code>release</code>, the ECS instances are released.</p>
     * </li>
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
     * <p>The timeout period, in seconds, for an ECS instance to stop during a scale-in. Valid values: 30 to 240.</p>
     * <blockquote>
     * <ul>
     * <li><p>By default, this parameter inherits its value from the scaling group, but you can override it when calling the <code>RemoveInstances</code> operation.</p>
     * </li>
     * <li><p>This parameter takes effect only during scale-in events where <code>RemovePolicy</code> is set to <code>release</code>.</p>
     * </li>
     * <li><p>If this parameter is set, the system waits for the specified duration for the instance to stop. The scale-in process continues after the timeout expires, regardless of the instance\&quot;s state.</p>
     * </li>
     * <li><p>If this parameter is not set, the system waits until the instance stops before continuing the scale-in process. If the instance fails to stop, the scale-in operation is rolled back and fails.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StopInstanceTimeout")
    public Integer stopInstanceTimeout;

    public static RemoveInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesRequest self = new RemoveInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveInstancesRequest setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
        this.decreaseDesiredCapacity = decreaseDesiredCapacity;
        return this;
    }
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    public RemoveInstancesRequest setIgnoreInvalidInstance(Boolean ignoreInvalidInstance) {
        this.ignoreInvalidInstance = ignoreInvalidInstance;
        return this;
    }
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    public RemoveInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RemoveInstancesRequest setLifecycleHookContext(RemoveInstancesRequestLifecycleHookContext lifecycleHookContext) {
        this.lifecycleHookContext = lifecycleHookContext;
        return this;
    }
    public RemoveInstancesRequestLifecycleHookContext getLifecycleHookContext() {
        return this.lifecycleHookContext;
    }

    public RemoveInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveInstancesRequest setRemovePolicy(String removePolicy) {
        this.removePolicy = removePolicy;
        return this;
    }
    public String getRemovePolicy() {
        return this.removePolicy;
    }

    public RemoveInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public RemoveInstancesRequest setStopInstanceTimeout(Integer stopInstanceTimeout) {
        this.stopInstanceTimeout = stopInstanceTimeout;
        return this;
    }
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
    }

    public static class RemoveInstancesRequestLifecycleHookContext extends TeaModel {
        /**
         * <p>Specifies whether to disable all lifecycle hooks for the scaling activity. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Disables all lifecycle hooks.</p>
         * </li>
         * <li><p><code>false</code>: Does not disable lifecycle hooks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableLifecycleHook")
        public Boolean disableLifecycleHook;

        /**
         * <p>A list of lifecycle hook IDs to ignore for the scaling activity.</p>
         */
        @NameInMap("IgnoredLifecycleHookIds")
        public java.util.List<String> ignoredLifecycleHookIds;

        @NameInMap("LifecycleHookResult")
        public String lifecycleHookResult;

        public static RemoveInstancesRequestLifecycleHookContext build(java.util.Map<String, ?> map) throws Exception {
            RemoveInstancesRequestLifecycleHookContext self = new RemoveInstancesRequestLifecycleHookContext();
            return TeaModel.build(map, self);
        }

        public RemoveInstancesRequestLifecycleHookContext setDisableLifecycleHook(Boolean disableLifecycleHook) {
            this.disableLifecycleHook = disableLifecycleHook;
            return this;
        }
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        public RemoveInstancesRequestLifecycleHookContext setIgnoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
            this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
            return this;
        }
        public java.util.List<String> getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

        public RemoveInstancesRequestLifecycleHookContext setLifecycleHookResult(String lifecycleHookResult) {
            this.lifecycleHookResult = lifecycleHookResult;
            return this;
        }
        public String getLifecycleHookResult() {
            return this.lifecycleHookResult;
        }

    }

}
