// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubscribedCalendarResponseBody body;

    public static CreateSubscribedCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribedCalendarResponse self = new CreateSubscribedCalendarResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscribedCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscribedCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscribedCalendarResponse setBody(CreateSubscribedCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscribedCalendarResponseBody getBody() {
        return this.body;
    }

}
