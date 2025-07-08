// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillRentalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonthlyBillRentalResponseBody body;

    public static QueryMonthlyBillRentalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillRentalResponse self = new QueryMonthlyBillRentalResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillRentalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyBillRentalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyBillRentalResponse setBody(QueryMonthlyBillRentalResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyBillRentalResponseBody getBody() {
        return this.body;
    }

}
