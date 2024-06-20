// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetMonthAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMonthAmountResponseBody body;

    public static GetMonthAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonthAmountResponse self = new GetMonthAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetMonthAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonthAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonthAmountResponse setBody(GetMonthAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonthAmountResponseBody getBody() {
        return this.body;
    }

}
