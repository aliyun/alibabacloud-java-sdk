// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMinutesResponseBody body;

    public static QueryMinutesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesResponse self = new QueryMinutesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMinutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMinutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMinutesResponse setBody(QueryMinutesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMinutesResponseBody getBody() {
        return this.body;
    }

}
