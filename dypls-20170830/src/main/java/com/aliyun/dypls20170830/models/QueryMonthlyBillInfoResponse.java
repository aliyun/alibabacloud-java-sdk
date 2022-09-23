// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonthlyBillInfoResponseBody body;

    public static QueryMonthlyBillInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillInfoResponse self = new QueryMonthlyBillInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyBillInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyBillInfoResponse setBody(QueryMonthlyBillInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyBillInfoResponseBody getBody() {
        return this.body;
    }

}
