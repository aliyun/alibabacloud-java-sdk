// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillInfoLeafNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonthlyBillInfoLeafNewResponseBody body;

    public static QueryMonthlyBillInfoLeafNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillInfoLeafNewResponse self = new QueryMonthlyBillInfoLeafNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillInfoLeafNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyBillInfoLeafNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyBillInfoLeafNewResponse setBody(QueryMonthlyBillInfoLeafNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyBillInfoLeafNewResponseBody getBody() {
        return this.body;
    }

}
