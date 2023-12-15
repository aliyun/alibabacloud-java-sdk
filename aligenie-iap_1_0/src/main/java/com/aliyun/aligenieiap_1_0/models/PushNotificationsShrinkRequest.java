// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsShrinkRequest extends TeaModel {
    @NameInMap("NotificationUnicastRequest")
    public String notificationUnicastRequestShrink;

    @NameInMap("TenantInfo")
    public String tenantInfoShrink;

    public static PushNotificationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNotificationsShrinkRequest self = new PushNotificationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushNotificationsShrinkRequest setNotificationUnicastRequestShrink(String notificationUnicastRequestShrink) {
        this.notificationUnicastRequestShrink = notificationUnicastRequestShrink;
        return this;
    }
    public String getNotificationUnicastRequestShrink() {
        return this.notificationUnicastRequestShrink;
    }

    public PushNotificationsShrinkRequest setTenantInfoShrink(String tenantInfoShrink) {
        this.tenantInfoShrink = tenantInfoShrink;
        return this;
    }
    public String getTenantInfoShrink() {
        return this.tenantInfoShrink;
    }

}
