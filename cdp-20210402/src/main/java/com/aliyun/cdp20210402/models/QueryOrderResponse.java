// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderResponseBody body;

    public static QueryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponse self = new QueryOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderResponse setBody(QueryOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderResponseBody getBody() {
        return this.body;
    }

}
