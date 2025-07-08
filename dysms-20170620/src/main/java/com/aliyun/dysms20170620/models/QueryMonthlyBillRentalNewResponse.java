// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillRentalNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonthlyBillRentalNewResponseBody body;

    public static QueryMonthlyBillRentalNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillRentalNewResponse self = new QueryMonthlyBillRentalNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillRentalNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyBillRentalNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyBillRentalNewResponse setBody(QueryMonthlyBillRentalNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyBillRentalNewResponseBody getBody() {
        return this.body;
    }

}
