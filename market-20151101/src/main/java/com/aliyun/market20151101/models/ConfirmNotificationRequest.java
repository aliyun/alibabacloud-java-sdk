// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ConfirmNotificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>deab3673236843a3b378c7d8d25c5f01</p>
     */
    @NameInMap("NotificationRequestId")
    public String notificationRequestId;

    public static ConfirmNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotificationRequest self = new ConfirmNotificationRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmNotificationRequest setNotificationRequestId(String notificationRequestId) {
        this.notificationRequestId = notificationRequestId;
        return this;
    }
    public String getNotificationRequestId() {
        return this.notificationRequestId;
    }

}
