// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ConfirmNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmNotificationResponseBody body;

    public static ConfirmNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotificationResponse self = new ConfirmNotificationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmNotificationResponse setBody(ConfirmNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmNotificationResponseBody getBody() {
        return this.body;
    }

}
