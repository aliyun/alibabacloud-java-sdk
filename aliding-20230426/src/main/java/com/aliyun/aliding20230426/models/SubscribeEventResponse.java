// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscribeEventResponseBody body;

    public static SubscribeEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeEventResponse self = new SubscribeEventResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeEventResponse setBody(SubscribeEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeEventResponseBody getBody() {
        return this.body;
    }

}
