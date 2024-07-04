// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteNotificationConfigurationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the notification method. The following list describes the value formats of this parameter:</p>
     * <ul>
     * <li>If you use CloudMonitor as the notification party, the value format of this parameter is acs:ess:{region-id}:{account-id}:cloudmonitor.</li>
     * <li>If you use an MNS queue as the notification party, the value format of this parameter is acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
     * <li>If you use an MNS topic as the notification party, the value format of this parameter is acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
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
     * <p>acs:ess:cn-beijing:161456884340****:cloudmonitor</p>
     */
    @NameInMap("NotificationArn")
    public String notificationArn;

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
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DeleteNotificationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationConfigurationRequest self = new DeleteNotificationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationConfigurationRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public DeleteNotificationConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteNotificationConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNotificationConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteNotificationConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
