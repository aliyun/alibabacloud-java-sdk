// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendRoomNotificationResponseBody body;

    public static SendRoomNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRoomNotificationResponse self = new SendRoomNotificationResponse();
        return TeaModel.build(map, self);
    }

    public SendRoomNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRoomNotificationResponse setBody(SendRoomNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRoomNotificationResponseBody getBody() {
        return this.body;
    }

}
