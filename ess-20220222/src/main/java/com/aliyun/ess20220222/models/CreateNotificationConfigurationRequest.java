// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigurationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the notification method. The following list describes the value formats of this parameter:</p>
     * <ul>
     * <li>If you use CloudMonitor as the notification method, the value format of this parameter is acs:ess:{region-id}:{account-id}:cloudmonitor.</li>
     * <li>If you use an MNS queue as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
     * <li>If you use an MNS topic as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
     * </ul>
     * <p>The variables in the preceding formats have the following meanings:</p>
     * <ul>
     * <li>region-id: the region ID of the scaling group.</li>
     * <li>account-id: the ID of the Alibaba Cloud account.</li>
     * <li>queuename: the name of the MNS queue.</li>
     * <li>topicname: the name of the MNS topic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

    /**
     * <p>The types of the notifications that you want to create. You can create one to eight notifications. Specify multiple values in the repeated list form.</p>
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

}
