// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryCarProcessEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCarProcessEventsResponseBody body;

    public static QueryCarProcessEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarProcessEventsResponse self = new QueryCarProcessEventsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarProcessEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCarProcessEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCarProcessEventsResponse setBody(QueryCarProcessEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCarProcessEventsResponseBody getBody() {
        return this.body;
    }

}
