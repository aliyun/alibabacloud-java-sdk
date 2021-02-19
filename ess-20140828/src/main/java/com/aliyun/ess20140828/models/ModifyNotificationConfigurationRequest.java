// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyNotificationConfigurationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("NotificationArn")
    public String notificationArn;

    @NameInMap("NotificationType")
    public java.util.List<String> notificationType;

    public static ModifyNotificationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNotificationConfigurationRequest self = new ModifyNotificationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNotificationConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNotificationConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNotificationConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ModifyNotificationConfigurationRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public ModifyNotificationConfigurationRequest setNotificationType(java.util.List<String> notificationType) {
        this.notificationType = notificationType;
        return this;
    }
    public java.util.List<String> getNotificationType() {
        return this.notificationType;
    }

}
