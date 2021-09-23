// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGatewayTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryGatewayTypeResponse setBody(QueryGatewayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGatewayTypeResponseBody getBody() {
        return this.body;
    }

}
