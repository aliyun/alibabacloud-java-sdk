// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGatewayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGatewayTypeResponseBody body;

    public static QueryGatewayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayTypeResponse self = new QueryGatewayTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryGatewayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGatewayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGatewayTypeResponse setBody(QueryGatewayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGatewayTypeResponseBody getBody() {
        return this.body;
    }

}
