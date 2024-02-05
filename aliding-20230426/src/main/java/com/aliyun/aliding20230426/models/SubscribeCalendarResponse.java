// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscribeCalendarResponseBody body;

    public static SubscribeCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeCalendarResponse self = new SubscribeCalendarResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeCalendarResponse setBody(SubscribeCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeCalendarResponseBody getBody() {
        return this.body;
    }

}
