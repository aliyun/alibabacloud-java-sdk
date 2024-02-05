// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSubscribedCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscribedCalendarResponseBody body;

    public static GetSubscribedCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscribedCalendarResponse self = new GetSubscribedCalendarResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscribedCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscribedCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscribedCalendarResponse setBody(GetSubscribedCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscribedCalendarResponseBody getBody() {
        return this.body;
    }

}
