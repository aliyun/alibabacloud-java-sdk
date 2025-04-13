// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryFieldLatestBySourcePointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFieldLatestBySourcePointResponseBody body;

    public static QueryFieldLatestBySourcePointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFieldLatestBySourcePointResponse self = new QueryFieldLatestBySourcePointResponse();
        return TeaModel.build(map, self);
    }

    public QueryFieldLatestBySourcePointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFieldLatestBySourcePointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFieldLatestBySourcePointResponse setBody(QueryFieldLatestBySourcePointResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFieldLatestBySourcePointResponseBody getBody() {
        return this.body;
    }

}
