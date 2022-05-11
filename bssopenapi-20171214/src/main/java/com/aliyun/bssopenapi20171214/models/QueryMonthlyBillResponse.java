// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonthlyBillResponseBody body;

    public static QueryMonthlyBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillResponse self = new QueryMonthlyBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyBillResponse setBody(QueryMonthlyBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyBillResponseBody getBody() {
        return this.body;
    }

}
