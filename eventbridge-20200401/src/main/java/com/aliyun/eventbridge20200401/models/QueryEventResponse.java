// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventResponseBody body;

    public static QueryEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventResponse self = new QueryEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventResponse setBody(QueryEventResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventResponseBody getBody() {
        return this.body;
    }

}
