// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyLifecycleHookRequest extends TeaModel {
    /**
     * <p>The action that you want Auto Scaling to perform after the lifecycle hook ends. Valid values:</p>
     * <br>
     * <p>*   CONTINUE: Auto Scaling continues to respond to scaling requests.</p>
     * <p>*   ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities, or removes ECS instances from the scaling group during scale-in activities.</p>
     * <br>
     * <p>If multiple lifecycle hooks in a scaling group are triggered during scale-in activities and you set the DefaultResult parameter to ABANDON for the lifecycle hook that you want to modify, Auto Scaling immediately performs the action after the lifecycle hook that you want to modify ends. As a result, other lifecycle hooks end ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks end.</p>
     */
    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>The period of time before the lifecycle hook ends. Auto Scaling performs the specified action after the lifecycle hook ends. Valid values: 30 to 21600. Unit: seconds.</p>
     * <br>
     * <p>You can call the RecordLifecycleActionHeartbeat operation to prolong the length of a lifecycle hook. You can also call the CompleteLifecycleAction operation to end a lifecycle hook ahead of schedule.</p>
     */
    @NameInMap("HeartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The ID of the lifecycle hook that you want to modify.</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    /**
     * <p>The name of the lifecycle hook that you want to modify.</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    /**
     * <p>The status into which you want to put the lifecycle hook. Valid values:</p>
     * <br>
     * <p>*   Active</p>
     * <p>*   InActive</p>
     * <br>
     * <p>If you do not specify this parameter, the status of the lifecycle hook remains unchanged after you call this operation.</p>
     * <br>
     * <p>> By default, a lifecycle hook is in the Active state after you create it.</p>
     */
    @NameInMap("LifecycleHookStatus")
    public String lifecycleHookStatus;

    /**
     * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
     * <br>
     * <p>*   SCALE_OUT</p>
     * <p>*   SCALE_IN</p>
     */
    @NameInMap("LifecycleTransition")
    public String lifecycleTransition;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the notification method. Specify the value in one of the following formats:</p>
     * <br>
     * <p>*   If the notification method is a Message Service (MNS) queue, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</p>
     * <p>*   If the notification method is an MNS topic, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</p>
     * <p>*   If the notification method is an Operation Orchestration Service (OOS) template, specify the value in the acs:oos:{region-id}:{account-id}:template/{templatename} format.</p>
     * <br>
     * <p>The variables in the preceding parameter formats have the following meanings:</p>
     * <br>
     * <p>*   region-id: the region ID of the scaling group.</p>
     * <p>*   account-id: the ID of the Alibaba Cloud account.</p>
     * <p>*   queuename: the name of the MNS queue.</p>
     * <p>*   topicname: the name of the MNS topic.</p>
     * <p>*   templatename: the name of the OOS template.</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The fixed string that is included in a notification. Auto Scaling sends the notification when the lifecycle hook takes effect. The value of this parameter cannot exceed 4,096 characters in length.</p>
     * <br>
     * <p>Auto Scaling sends the value specified for the NotificationMetadata parameter together with the notification. This helps you categorize your notifications. The NotificationMetadata parameter takes effect only after you specify the NotificationArn parameter.</p>
     */
    @NameInMap("NotificationMetadata")
    public String notificationMetadata;

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
     * <p>The ID of the scaling group to which the lifecycle hook belongs.</p>
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
