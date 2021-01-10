// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomUserNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendRoomUserNotificationResponseBody body;

    public static SendRoomUserNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRoomUserNotificationResponse self = new SendRoomUserNotificationResponse();
        return TeaModel.build(map, self);
    }

    public SendRoomUserNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRoomUserNotificationResponse setBody(SendRoomUserNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRoomUserNotificationResponseBody getBody() {
        return this.body;
    }

}
