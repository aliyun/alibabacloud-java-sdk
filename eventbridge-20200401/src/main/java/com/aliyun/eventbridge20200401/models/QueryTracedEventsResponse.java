// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTracedEventsResponseBody body;

    public static QueryTracedEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventsResponse self = new QueryTracedEventsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTracedEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTracedEventsResponse setBody(QueryTracedEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTracedEventsResponseBody getBody() {
        return this.body;
    }

}
