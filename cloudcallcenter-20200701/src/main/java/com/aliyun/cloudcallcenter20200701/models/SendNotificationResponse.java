// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SendNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendNotificationResponseBody body;

    public static SendNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationResponse self = new SendNotificationResponse();
        return TeaModel.build(map, self);
    }

    public SendNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendNotificationResponse setBody(SendNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SendNotificationResponseBody getBody() {
        return this.body;
    }

}
