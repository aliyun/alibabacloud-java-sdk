// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryNoBuyTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNoBuyTasksResponseBody body;

    public static QueryNoBuyTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNoBuyTasksResponse self = new QueryNoBuyTasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryNoBuyTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNoBuyTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNoBuyTasksResponse setBody(QueryNoBuyTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNoBuyTasksResponseBody getBody() {
        return this.body;
    }

}
