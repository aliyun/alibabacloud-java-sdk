// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomNotificationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MessageId")
    @Validation(required = true)
    public String messageId;

    public static SendRoomNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRoomNotificationResponse self = new SendRoomNotificationResponse();
        return TeaModel.build(map, self);
    }

    public SendRoomNotificationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRoomNotificationResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
