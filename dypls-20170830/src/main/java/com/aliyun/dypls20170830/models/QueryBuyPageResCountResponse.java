// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBuyPageResCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBuyPageResCountResponseBody body;

    public static QueryBuyPageResCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyPageResCountResponse self = new QueryBuyPageResCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuyPageResCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBuyPageResCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBuyPageResCountResponse setBody(QueryBuyPageResCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBuyPageResCountResponseBody getBody() {
        return this.body;
    }

}
