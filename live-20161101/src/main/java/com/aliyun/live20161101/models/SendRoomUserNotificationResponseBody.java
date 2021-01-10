// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomUserNotificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static SendRoomUserNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendRoomUserNotificationResponseBody self = new SendRoomUserNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public SendRoomUserNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRoomUserNotificationResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
