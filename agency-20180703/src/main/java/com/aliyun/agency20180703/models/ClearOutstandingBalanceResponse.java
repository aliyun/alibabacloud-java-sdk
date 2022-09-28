// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class ClearOutstandingBalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClearOutstandingBalanceResponseBody body;

    public static ClearOutstandingBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearOutstandingBalanceResponse self = new ClearOutstandingBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ClearOutstandingBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearOutstandingBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearOutstandingBalanceResponse setBody(ClearOutstandingBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearOutstandingBalanceResponseBody getBody() {
        return this.body;
    }

}
