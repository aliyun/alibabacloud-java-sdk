// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class SendNotificationsShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("NotificationUnicastRequest")
    public String notificationUnicastRequestShrink;

    @NameInMap("TenantInfo")
    public String tenantInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static SendNotificationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationsShrinkRequest self = new SendNotificationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendNotificationsShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public SendNotificationsShrinkRequest setNotificationUnicastRequestShrink(String notificationUnicastRequestShrink) {
        this.notificationUnicastRequestShrink = notificationUnicastRequestShrink;
        return this;
    }
    public String getNotificationUnicastRequestShrink() {
        return this.notificationUnicastRequestShrink;
    }

    public SendNotificationsShrinkRequest setTenantInfoShrink(String tenantInfoShrink) {
        this.tenantInfoShrink = tenantInfoShrink;
        return this;
    }
    public String getTenantInfoShrink() {
        return this.tenantInfoShrink;
    }

    public SendNotificationsShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
