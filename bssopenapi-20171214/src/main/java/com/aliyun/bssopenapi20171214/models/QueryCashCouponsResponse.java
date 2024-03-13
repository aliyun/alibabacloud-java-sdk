// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCashCouponsResponseBody body;

    public static QueryCashCouponsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsResponse self = new QueryCashCouponsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCashCouponsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCashCouponsResponse setBody(QueryCashCouponsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCashCouponsResponseBody getBody() {
        return this.body;
    }

}
