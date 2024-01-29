// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGatewayRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGatewayRegionResponseBody body;

    public static QueryGatewayRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayRegionResponse self = new QueryGatewayRegionResponse();
        return TeaModel.build(map, self);
    }

    public QueryGatewayRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGatewayRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGatewayRegionResponse setBody(QueryGatewayRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGatewayRegionResponseBody getBody() {
        return this.body;
    }

}
