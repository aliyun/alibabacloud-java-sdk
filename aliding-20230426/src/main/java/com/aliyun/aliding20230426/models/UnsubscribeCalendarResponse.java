// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeCalendarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnsubscribeCalendarResponseBody body;

    public static UnsubscribeCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeCalendarResponse self = new UnsubscribeCalendarResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsubscribeCalendarResponse setBody(UnsubscribeCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeCalendarResponseBody getBody() {
        return this.body;
    }

}
