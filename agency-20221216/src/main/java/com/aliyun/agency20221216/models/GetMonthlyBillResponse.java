// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonthlyBillResponseBody body;

    public static GetMonthlyBillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonthlyBillResponse self = new GetMonthlyBillResponse();
        return TeaModel.build(map, self);
    }

    public GetMonthlyBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonthlyBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonthlyBillResponse setBody(GetMonthlyBillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonthlyBillResponseBody getBody() {
        return this.body;
    }

}
