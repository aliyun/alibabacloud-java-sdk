// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class QueryForCssOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryForCssOrderResponseBody body;

    public static QueryForCssOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryForCssOrderResponse self = new QueryForCssOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryForCssOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryForCssOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryForCssOrderResponse setBody(QueryForCssOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryForCssOrderResponseBody getBody() {
        return this.body;
    }

}
