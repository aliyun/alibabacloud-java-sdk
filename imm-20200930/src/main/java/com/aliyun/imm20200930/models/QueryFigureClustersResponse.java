// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFigureClustersResponseBody body;

    public static QueryFigureClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFigureClustersResponse self = new QueryFigureClustersResponse();
        return TeaModel.build(map, self);
    }

    public QueryFigureClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFigureClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFigureClustersResponse setBody(QueryFigureClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFigureClustersResponseBody getBody() {
        return this.body;
    }

}
