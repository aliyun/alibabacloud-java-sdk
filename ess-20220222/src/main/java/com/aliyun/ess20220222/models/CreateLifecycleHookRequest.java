// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookRequest extends TeaModel {
    /**
     * <p>The action to be performed after the wait state ends. Valid values: </p>
     * <ul>
     * <li>CONTINUE: Continues the response to the scale-out or scale-in activity.</li>
     * <li>ABANDON: Releases the ECS instances created by the scale-out activity or removes the ECS instances in the scale-in activity from the scaling group. </li>
     * <li>ROLLBACK: Rejects the release of ECS instances and rolls back the scale-in activity. For a scale-out activity, this value directly releases the created ECS instances, which has the same effect as ABANDON.</li>
     * </ul>
     * <p>When a scale-in activity occurs in the scaling group and multiple lifecycle hooks are triggered, if the DefaultResult of one lifecycle hook is set to ABANDON or ROLLBACK and the wait state of the hook ends, the wait states of other lifecycle hooks are ended in advance. In other cases, the action to be performed is subject to the action of the last lifecycle hook whose wait state ends.</p>
     * <p>Default value: CONTINUE.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTINUE</p>
     */
    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>The wait time configured by the lifecycle hook for the scaling activity. After the wait state times out, the next action is performed. Valid values: 30 to 21600. Unit: seconds.</p>
     * <p>After you create a lifecycle hook, you can call RecordLifecycleActionHeartbeat to extend the wait time of the ECS instance, or call CompleteLifecycleAction to end the wait state of the scaling activity in advance. </p>
     * <p>Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("HeartbeatTimeout")
    public Integer heartbeatTimeout;

    /**
     * <p>The specific scenarios triggered by the lifecycle hook.</p>
     */
    @NameInMap("LifecycleActionSources")
    public java.util.List<String> lifecycleActionSources;

    /**
     * <p>The name of the lifecycle hook. The name must be unique among all lifecycle hooks in the current scaling group. It must be 2 to 64 characters in length, start with a digit, an uppercase or lowercase letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>Default value: the value of LifecycleHookId.</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclehook****</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    /**
     * <p>The type of scaling activity to which the lifecycle hook applies. Valid values: </p>
     * <ul>
     * <li>SCALE_OUT: scale-out activity of the scaling group. </li>
     * <li>SCALE_IN: scale-in activity of the scaling group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCALE_OUT</p>
     */
    @NameInMap("LifecycleTransition")
    public String lifecycleTransition;

    /**
     * <p>The identifier of the notification recipient for the lifecycle hook. If you do not specify this parameter, no notifications are sent. If you specify this parameter, the following notification methods are supported:</p>
     * <ul>
     * <li>MNS queue. Format: acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
     * <li>MNS topic. Format: acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
     * <li>OOS template. Format: acs:oos:{region-id}:{account-id}:template/{templatename}.</li>
     * <li>EventBridge. Format: acs:eventbridge:{region-id}:{account-id}:eventbus/default.</li>
     * </ul>
     * <p>The variables in the formats have the following meanings:</p>
     * <ul>
     * <li>region-id: the ID of the region where the scaling group resides.</li>
     * <li>account-id: the Alibaba Cloud account ID. The ID of a Resource Access Management (RAM) user is not supported.</li>
     * <li>queuename: the name of the MNS queue.</li>
     * <li>topicname: the name of the MNS topic.</li>
     * <li>templatename: the name of the OOS template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The notification message pushed to the NotificationArn (notification recipient) when the lifecycle hook pauses the scaling activity. This parameter helps you manage and mark different types of notification messages. You must specify NotificationArn together with this parameter. The value can be up to 4,096 characters in length.</p>
     * <p>If NotificationArn is set to an OOS template, including a public or custom template, NotificationMetadata must be specified as a JSON string that matches the parameters of the OOS template. For example, <code>{&quot;dbInstanceId&quot;: &quot;dds-bp17661e0135****&quot;, &quot;modifyMode&quot;: &quot;Append&quot;}</code>, where <code>dbInstanceId</code> and <code>modifyMode</code> are parameters defined in the OOS template. Some parameters of the OOS template have default values. You must specify parameters without default values in NotificationMetadata. If you specify parameters with default values, the original default values are overwritten. However, keep the default values for the following parameters to obtain relevant information at runtime:</p>
     * <ul>
     * <li><p><code>regionId</code>: the region where the scaling activity is executed. Default value: ${regionId}.</p>
     * </li>
     * <li><p><code>instanceIds</code>: the list of instances associated with the scaling activity. Default value: ${instanceIds}.</p>
     * </li>
     * <li><p><code>lifecycleHookId</code>: the ID of the lifecycle hook. Default value: ${lifecycleHookId}.</p>
     * </li>
     * <li><p><code>lifecycleActionToken</code>: the wait state identifier for the scaling activity, which is used to end the current suspended activity in advance. Default value: ${lifecycleActionToken}.</p>
     * </li>
     * <li><p><code>scalingGroupId</code>: the ID of the scaling group to which the scaling activity belongs. Default value: ${scalingGroupId}.</p>
     * </li>
     * <li><p><code>lifecycleActionResult</code>: the action to be performed after the wait state of the lifecycle hook ends. This parameter is used to end the current suspended activity in advance when the OOS template execution fails. When DefaultResult is set to ROLLBACK, the default value of this parameter is ROLLBACK. In other cases, the default value is ABANDON.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can configure the value of lifecycleActionResult to overwrite the current default value as needed. Valid values: ABANDON, CONTINUE, ROLLBACK, and ${lifecycleActionResult}.
     * Among these values, ${lifecycleActionResult} indicates that the value of lifecycleActionResult is the same as that of DefaultResult.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You can obtain detailed information about the parameters of the corresponding template in the <a href="https://oos.console.aliyun.com/">OOS console</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test lifecycle hook.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1eyv4qn8ssgv43****</p>
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

    public CreateLifecycleHookRequest setLifecycleActionSources(java.util.List<String> lifecycleActionSources) {
        this.lifecycleActionSources = lifecycleActionSources;
        return this;
    }
    public java.util.List<String> getLifecycleActionSources() {
        return this.lifecycleActionSources;
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
