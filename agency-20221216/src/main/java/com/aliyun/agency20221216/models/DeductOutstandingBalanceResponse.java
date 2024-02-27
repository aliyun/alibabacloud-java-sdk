// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class DeductOutstandingBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeductOutstandingBalanceResponseBody body;

    public static DeductOutstandingBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeductOutstandingBalanceResponse self = new DeductOutstandingBalanceResponse();
        return TeaModel.build(map, self);
    }

    public DeductOutstandingBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeductOutstandingBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeductOutstandingBalanceResponse setBody(DeductOutstandingBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeductOutstandingBalanceResponseBody getBody() {
        return this.body;
    }

}
