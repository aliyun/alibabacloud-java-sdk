// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetDailyBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDailyBillResponseBody body;

    public static GetDailyBillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillResponse self = new GetDailyBillResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDailyBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDailyBillResponse setBody(GetDailyBillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDailyBillResponseBody getBody() {
        return this.body;
    }

}
