// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyLifecycleHookRequest extends TeaModel {
    /**
     * <p>The subsequent action to perform after the wait state ends. Valid values: </p>
     * <ul>
     * <li>CONTINUE: Continues the response to the scale-out or scale-down activity.</li>
     * <li>ABANDON: Releases the ECS instances created during the scale-out activity or removes the ECS instances from the scaling group during the scale-down activity.</li>
     * <li>ROLLBACK: Rejects the release of ECS instances and rolls back the scale-down activity. For a scale-out activity, releases the created ECS instances, which has the same effect as ABANDON.</li>
     * </ul>
     * <p>If a scale-down activity is triggered and multiple lifecycle hooks are invoked, and the DefaultResult of one lifecycle hook is set to ABANDON or ROLLBACK, the wait states of other lifecycle hooks are ended in advance when the wait state of this hook ends. In other cases, the subsequent action is determined by the last lifecycle hook that ends its wait state.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTINUE</p>
     */
    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>The wait time set by the lifecycle hook for the scaling activity. The subsequent action is performed after the wait state times out. Valid values: 30 to 21600. Unit: seconds.</p>
     * <p>You can call the RecordLifecycleActionHeartbeat operation to extend the wait time of the ECS instance, or call the CompleteLifecycleAction operation to end the wait state of the scaling activity in advance.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("HeartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The specific scenarios that trigger the lifecycle hook.</p>
     */
    @NameInMap("LifecycleActionSources")
    public java.util.List<String> lifecycleActionSources;

    /**
     * <p>The ID of the lifecycle hook to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>ash-bp1fxuqyi98w0aib****</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    /**
     * <p>The name of the lifecycle hook to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>test_SCAL****</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    /**
     * <p>The status of the lifecycle hook. Valid values:</p>
     * <ul>
     * <li>Active: Enables the lifecycle hook.</li>
     * <li>InActive: Disables the lifecycle hook.</li>
     * </ul>
     * <p>If you do not specify this parameter, the status of the lifecycle hook remains unchanged.</p>
     * <blockquote>
     * <p>After a lifecycle hook is created, it is enabled by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LifecycleHookStatus")
    public String lifecycleHookStatus;

    /**
     * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
     * <ul>
     * <li>SCALE_OUT: Scale-out activity of the scaling group.</li>
     * <li>SCALE_IN: Scale-in activity of the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SCALE_IN</p>
     */
    @NameInMap("LifecycleTransition")
    public String lifecycleTransition;

    /**
     * <p>The identifier of the notification recipient for the lifecycle hook. The following notification methods are supported:</p>
     * <ul>
     * <li>Message Service (MNS) queue. Format: acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
     * <li>MNS topic. Format: acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
     * <li>Operation Orchestration Service (OOS) template. Format: acs:oos:{region-id}:{account-id}:template/{templatename}.</li>
     * <li>EventBridge. Format: acs:eventbridge:{region-id}:{account-id}:eventbus/default.</li>
     * </ul>
     * <p>Variables in the formats:</p>
     * <ul>
     * <li>region-id: The ID of the region where the scaling group resides.</li>
     * <li>account-id: The Alibaba Cloud account ID.</li>
     * <li>queuename: The name of the MNS queue.</li>
     * <li>topicname: The name of the MNS topic.</li>
     * <li>templatename: The name of the OOS template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The fixed string information for the wait state of the scaling activity. The value can be up to 4,096 characters in length.</p>
     * <p>When Auto Scaling pushes a message to the notification recipient, it also sends the predefined NotificationMetadata value to help you manage and tag different types of notifications. This parameter takes effect only when the NotificationArn parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("NotificationMetadata")
    public String notificationMetadata;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group to which the lifecycle hook belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ModifyLifecycleHookRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLifecycleHookRequest self = new ModifyLifecycleHookRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLifecycleHookRequest setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }
    public String getDefaultResult() {
        return this.defaultResult;
    }

    public ModifyLifecycleHookRequest setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    public ModifyLifecycleHookRequest setLifecycleActionSources(java.util.List<String> lifecycleActionSources) {
        this.lifecycleActionSources = lifecycleActionSources;
        return this;
    }
    public java.util.List<String> getLifecycleActionSources() {
        return this.lifecycleActionSources;
    }

    public ModifyLifecycleHookRequest setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    public ModifyLifecycleHookRequest setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    public ModifyLifecycleHookRequest setLifecycleHookStatus(String lifecycleHookStatus) {
        this.lifecycleHookStatus = lifecycleHookStatus;
        return this;
    }
    public String getLifecycleHookStatus() {
        return this.lifecycleHookStatus;
    }

    public ModifyLifecycleHookRequest setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    public ModifyLifecycleHookRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public ModifyLifecycleHookRequest setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }
    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    public ModifyLifecycleHookRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLifecycleHookRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLifecycleHookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLifecycleHookRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLifecycleHookRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
