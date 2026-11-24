// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigurationRequest extends TeaModel {
    /**
     * <p>The encoding method for the notification content. Valid values:</p>
     * <ul>
     * <li>PlainText: no encoding. The content is transmitted in plaintext.</li>
     * <li>Base64: Base64 encoding.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * <blockquote>
     * <p>The Settings for this parameter are supported only for MNS notification recipients.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("MessageEncoding")
    public String messageEncoding;

    /**
     * <p>The identifier of the notification recipient. The following notification methods are supported when you configure the Settings for this parameter:</p>
     * <ul>
     * <li>Cloud monitoring. Format: <code>acs:ess:{region-id}:{account-id}:cloudmonitor</code>.</li>
     * <li>MNS queue. Format: <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code>.</li>
     * <li>MNS topic. Format: <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code>.</li>
     * </ul>
     * <p>Variables in the formats:</p>
     * <ul>
     * <li><code>region-id</code>: the ID of the region where the scaling group resides.</li>
     * <li><code>account-id</code>: the Alibaba Cloud account ID. You can invoke the STS GetCallerIdentity operation to obtain the AccountId response parameter, or view it by clicking your profile picture in the upper-right corner of the Alibaba Cloud Management Console.</li>
     * <li><code>queuename</code>: the name of the MNS queue.</li>
     * <li><code>topicname</code>: the name of the MNS topic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The types of Auto Scaling events and resource changes for which you want to receive notifications. You can specify multiple values by using a repeated list.</p>
     * <p>You can invoke the DescribeNotificationTypes operation to query parameter values.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the scaling group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The time zone for notifications.
     * Specify the time zone offset from Coordinated Universal Time (UTC), such as UTC+8 or UTC-7.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static CreateNotificationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotificationConfigurationRequest self = new CreateNotificationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotificationConfigurationRequest setMessageEncoding(String messageEncoding) {
        this.messageEncoding = messageEncoding;
        return this;
    }
    public String getMessageEncoding() {
        return this.messageEncoding;
    }

    public CreateNotificationConfigurationRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public CreateNotificationConfigurationRequest setNotificationTypes(java.util.List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }
    public java.util.List<String> getNotificationTypes() {
        return this.notificationTypes;
    }

    public CreateNotificationConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNotificationConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNotificationConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNotificationConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateNotificationConfigurationRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
