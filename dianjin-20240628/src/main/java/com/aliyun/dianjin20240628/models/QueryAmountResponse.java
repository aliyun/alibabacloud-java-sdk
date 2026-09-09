// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAmountResponseBody body;

    public static QueryAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAmountResponse self = new QueryAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAmountResponse setBody(QueryAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAmountResponseBody getBody() {
        return this.body;
    }

}
