// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceMessageRoutingResponseBody body;

    public static QueryEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceMessageRoutingResponse self = new QueryEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceMessageRoutingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceMessageRoutingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceMessageRoutingResponse setBody(QueryEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
