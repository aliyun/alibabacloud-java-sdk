// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryControlStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryControlStrategyResponseBody body;

    public static QueryControlStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryControlStrategyResponse self = new QueryControlStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryControlStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryControlStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryControlStrategyResponse setBody(QueryControlStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryControlStrategyResponseBody getBody() {
        return this.body;
    }

}
