// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryWithSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWithSQLResponseBody body;

    public static QueryWithSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithSQLResponse self = new QueryWithSQLResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWithSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWithSQLResponse setBody(QueryWithSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWithSQLResponseBody getBody() {
        return this.body;
    }

}
