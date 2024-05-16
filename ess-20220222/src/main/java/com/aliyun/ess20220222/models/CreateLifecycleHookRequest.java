// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookRequest extends TeaModel {
    /**
     * <p>The action that you want Auto Scaling to perform after the lifecycle hook times out. Valid values:</p>
     * <br>
     * <p>*   CONTINUE: Auto Scaling continues to respond to scale-in or scale-out requests.</p>
     * <p>*   ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities, or removes ECS instances from the scaling group during scale-in activities.</p>
     * <br>
     * <p>If multiple lifecycle hooks in a scaling group are triggered during scale-in activities and you set the DefaultResult parameter to ABANDON for one of the lifecycle hooks, Auto Scaling immediately performs the action after the lifecycle hook whose DefaultResult is set to ABANDON times out. As a result, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out.</p>
     * <br>
     * <p>Default value: CONTINUE.</p>
     */
    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>The period of time before the lifecycle hook times out. After the lifecycle hook times out, Auto Scaling performs the default action. Valid values: 30 to 21600. Unit: seconds.</p>
     * <br>
     * <p>After you create a lifecycle hook, you can call the RecordLifecycleActionHeartbeat operation to prolong the timeout period of the lifecycle hook. You can also call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule.</p>
     * <br>
     * <p>Default value: 600.</p>
     */
    @NameInMap("HeartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The name of the lifecycle hook. Each lifecycle hook name must be unique within a scaling group. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or a digit.</p>
     * <br>
     * <p>If you do not specify this parameter, the value of the LifecycleHookId parameter is used.</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    /**
     * <p>The type of the scaling activity to which the lifecycle hook applies. Valid values:</p>
     * <br>
     * <p>*   SCALE_OUT</p>
     * <p>*   SCALE_IN</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LifecycleTransition")
    public String lifecycleTransition;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the notification method that is used by Auto Scaling to send notifications when the lifecycle hook takes effect. If you do not specify this parameter, no notification is sent when the lifecycle hook takes effect. If you specify this parameter, the following rules apply:</p>
     * <br>
     * <p>*   If you use a Message Service (MNS) queue as the notification method, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</p>
     * <p>*   If you use an MNS topic as the notification method, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</p>
     * <p>*   If you use an OOS template as the notification method, specify the value in the acs:oos:{region-id}:{account-id}:template/{templatename} format.</p>
     * <br>
     * <p>The variables in the preceding parameter formats have the following meanings:</p>
     * <br>
     * <p>*   region-id: the region ID of the scaling group.</p>
     * <p>*   account-id: the ID of the Alibaba Cloud account. The ID of the RAM user is not supported.</p>
     * <p>*   queuename: the name of the MNS queue.</p>
     * <p>*   topicname: the name of the MNS topic.</p>
     * <p>*   templatename: the name of the OOS template.</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The notification metadata that is sent when the lifecycle hook takes effect. This helps you manage and categorize notifications in an efficient manner. If you specify this parameter, you must specify the NotificationArn parameter. The parameter value cannot exceed 4,096 characters in length.</p>
     * <br>
     * <p>If you use the NotificationArn parameter to specify a public or customOOS template, the value of the NotificationMetadata parameter must be a JSON string that contains the OOS template parameters. For example, your OOS template includes the following parameters: `{"dbInstanceId": "dds-bp17661e0135****", "modifyMode": "Append"}`, `dbInstanceId`, and `modifyMode`. Some parameters defined in your OOS template have default values. When you specify the NotificationMetadata parameter, specify parameters that do not have default values. If you specify parameters that have default values, the default values are overwritten. However, the default values of the following parameters must be retained to obtain information about scaling activities that are in progress:</p>
     * <br>
     * <p>*   `regionId`: the region ID of the scaling activity that is in progress. Default value: ${regionId}.</p>
     * <p>*   `instanceIds`: the IDs of ECS instances that are scaled in in the scaling activity. Default value: ${instanceIds}.</p>
     * <p>*   `lifecycleHookId`: the ID of the lifecycle hook. Default value: ${lifecycleHookId}.</p>
     * <p>*   `lifecycleActionToken`: the token of the lifecycle action. You can use the token to end the timeout period of the lifecycle hook ahead of schedule. Default value: ${lifecycleActionToken}</p>
     * <p>*   `scalingGroupId`: the ID of the scaling group in which the scaling activity is executed. Default value: ${scalingGroupId}.</p>
     * <br>
     * <p>> You can obtain template parameter information in the [OOS console](https://oos.console.aliyun.com/).</p>
     */
    @NameInMap("NotificationMetadata")
    public String notificationMetadata;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static CreateLifecycleHookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleHookRequest self = new CreateLifecycleHookRequest();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleHookRequest setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }
    public String getDefaultResult() {
        return this.defaultResult;
    }

    public CreateLifecycleHookRequest setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    public CreateLifecycleHookRequest setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    public CreateLifecycleHookRequest setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    public CreateLifecycleHookRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public CreateLifecycleHookRequest setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }
    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    public CreateLifecycleHookRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLifecycleHookRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLifecycleHookRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLifecycleHookRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
