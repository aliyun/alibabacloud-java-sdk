// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsShrinkRequest extends TeaModel {
    // 消息推送入参对象。
    @NameInMap("NotificationUnicastRequest")
    public String notificationUnicastRequestShrink;

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

}
