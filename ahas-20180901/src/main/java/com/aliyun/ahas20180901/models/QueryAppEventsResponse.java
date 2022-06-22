// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppEventsResponseBody body;

    public static QueryAppEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppEventsResponse self = new QueryAppEventsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppEventsResponse setBody(QueryAppEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppEventsResponseBody getBody() {
        return this.body;
    }

}
