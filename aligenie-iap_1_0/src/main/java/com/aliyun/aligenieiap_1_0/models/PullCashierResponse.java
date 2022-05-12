// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PullCashierResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PullCashierResponseBody body;

    public static PullCashierResponse build(java.util.Map<String, ?> map) throws Exception {
        PullCashierResponse self = new PullCashierResponse();
        return TeaModel.build(map, self);
    }

    public PullCashierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullCashierResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PullCashierResponse setBody(PullCashierResponseBody body) {
        this.body = body;
        return this;
    }
    public PullCashierResponseBody getBody() {
        return this.body;
    }

}
