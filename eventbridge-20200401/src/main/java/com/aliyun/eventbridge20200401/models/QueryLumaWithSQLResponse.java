// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryLumaWithSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLumaWithSQLResponseBody body;

    public static QueryLumaWithSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLumaWithSQLResponse self = new QueryLumaWithSQLResponse();
        return TeaModel.build(map, self);
    }

    public QueryLumaWithSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLumaWithSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLumaWithSQLResponse setBody(QueryLumaWithSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLumaWithSQLResponseBody getBody() {
        return this.body;
    }

}
