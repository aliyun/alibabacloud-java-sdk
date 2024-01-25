// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRenewOrderResponseBody body;

    public static QueryRenewOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewOrderResponse self = new QueryRenewOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryRenewOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRenewOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRenewOrderResponse setBody(QueryRenewOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewOrderResponseBody getBody() {
        return this.body;
    }

}
