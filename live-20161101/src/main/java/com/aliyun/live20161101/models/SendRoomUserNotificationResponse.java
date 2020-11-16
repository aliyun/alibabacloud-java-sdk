// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomUserNotificationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MessageId")
    @Validation(required = true)
    public String messageId;

    public static SendRoomUserNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRoomUserNotificationResponse self = new SendRoomUserNotificationResponse();
        return TeaModel.build(map, self);
    }

    public SendRoomUserNotificationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRoomUserNotificationResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
