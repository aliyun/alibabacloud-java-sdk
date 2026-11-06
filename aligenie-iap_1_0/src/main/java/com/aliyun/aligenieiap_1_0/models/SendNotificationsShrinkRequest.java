// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class SendNotificationsShrinkRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Input parameter object for message push.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationUnicastRequest")
    public String notificationUnicastRequestShrink;

    /**
     * <p>Identity information.</p>
     */
    @NameInMap("TenantInfo")
    public String tenantInfoShrink;

    /**
     * <p>User Identifier information</p>
     * <p>This parameter is required.</p>
     */
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
