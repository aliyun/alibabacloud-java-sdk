// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class NotificationShrinkRequest extends TeaModel {
    // 消息推送入参对象
    @NameInMap("NotificationUnicastRequest")
    public String notificationUnicastRequestShrink;

    @NameInMap("TenantInfo")
    public String tenantInfoShrink;

    public static NotificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        NotificationShrinkRequest self = new NotificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public NotificationShrinkRequest setNotificationUnicastRequestShrink(String notificationUnicastRequestShrink) {
        this.notificationUnicastRequestShrink = notificationUnicastRequestShrink;
        return this;
    }
    public String getNotificationUnicastRequestShrink() {
        return this.notificationUnicastRequestShrink;
    }

    public NotificationShrinkRequest setTenantInfoShrink(String tenantInfoShrink) {
        this.tenantInfoShrink = tenantInfoShrink;
        return this;
    }
    public String getTenantInfoShrink() {
        return this.tenantInfoShrink;
    }

}
