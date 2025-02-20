// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnsubscribeEventResponseBody body;

    public static UnsubscribeEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeEventResponse self = new UnsubscribeEventResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsubscribeEventResponse setBody(UnsubscribeEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeEventResponseBody getBody() {
        return this.body;
    }

}
