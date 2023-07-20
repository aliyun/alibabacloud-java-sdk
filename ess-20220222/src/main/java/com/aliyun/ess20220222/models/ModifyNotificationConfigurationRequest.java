// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyNotificationConfigurationRequest extends TeaModel {
    @NameInMap("NotificationArn")
    public String notificationArn;

    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ModifyNotificationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNotificationConfigurationRequest self = new ModifyNotificationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNotificationConfigurationRequest setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }
    public String getNotificationArn() {
        return this.notificationArn;
    }

    public ModifyNotificationConfigurationRequest setNotificationTypes(java.util.List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }
    public java.util.List<String> getNotificationTypes() {
        return this.notificationTypes;
    }

    public ModifyNotificationConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNotificationConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
