// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceGatewayResponseBody body;

    public static QueryEdgeInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceGatewayResponse self = new QueryEdgeInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceGatewayResponse setBody(QueryEdgeInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
