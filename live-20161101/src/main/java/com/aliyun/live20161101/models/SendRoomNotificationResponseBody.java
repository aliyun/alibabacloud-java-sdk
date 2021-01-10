// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomNotificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static SendRoomNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendRoomNotificationResponseBody self = new SendRoomNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public SendRoomNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRoomNotificationResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
