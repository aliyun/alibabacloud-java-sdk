// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigurationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. The following list describes the value formats of this parameter:</p>
     * <ul>
     * <li>If you specify CloudMonitor as the notification recipient, specify the value in the <code>acs:ess:{region-id}:{account-id}:cloudmonitor</code> format.</li>
     * <li>If you specify an MNS queue as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code> format.</li>
     * <li>If you specify an MNS topic as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code> format.</li>
     * </ul>
     * <p>The variables in the preceding formats have the following meanings:</p>
     * <ul>
     * <li><code>region-id</code>: the region ID of the scaling group.</li>
     * <li><code>account-id</code>: the ID of the Alibaba Cloud account.</li>
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
     * <p>The notification types. Specify multiple IDs in the repeated list form.</p>
     * <p>You can call the DescribeNotificationTypes operation to query the values of this parameter.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

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
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The time zone of the notification. Specify the value in UTC. For example, a value of UTC+8 specifies that the time is 8 hours ahead of Coordinated Universal Time, and a value of UTC-7 specifies that the time is 7 hours behind Coordinated Universal Time.</p>
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
