// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDriverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceDriverResponseBody body;

    public static QueryEdgeInstanceDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDriverResponse self = new QueryEdgeInstanceDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceDriverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceDriverResponse setBody(QueryEdgeInstanceDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceDriverResponseBody getBody() {
        return this.body;
    }

}
