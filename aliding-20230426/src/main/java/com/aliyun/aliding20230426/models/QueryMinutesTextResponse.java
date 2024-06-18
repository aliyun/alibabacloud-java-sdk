// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMinutesTextResponseBody body;

    public static QueryMinutesTextResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesTextResponse self = new QueryMinutesTextResponse();
        return TeaModel.build(map, self);
    }

    public QueryMinutesTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMinutesTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMinutesTextResponse setBody(QueryMinutesTextResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMinutesTextResponseBody getBody() {
        return this.body;
    }

}
