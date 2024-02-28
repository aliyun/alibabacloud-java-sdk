// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventByEventIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTracedEventByEventIdResponseBody body;

    public static QueryTracedEventByEventIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventByEventIdResponse self = new QueryTracedEventByEventIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventByEventIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTracedEventByEventIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTracedEventByEventIdResponse setBody(QueryTracedEventByEventIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTracedEventByEventIdResponseBody getBody() {
        return this.body;
    }

}
