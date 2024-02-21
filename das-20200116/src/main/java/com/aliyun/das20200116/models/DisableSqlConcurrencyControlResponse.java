// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableSqlConcurrencyControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSqlConcurrencyControlResponseBody body;

    public static DisableSqlConcurrencyControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlConcurrencyControlResponse self = new DisableSqlConcurrencyControlResponse();
        return TeaModel.build(map, self);
    }

    public DisableSqlConcurrencyControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSqlConcurrencyControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSqlConcurrencyControlResponse setBody(DisableSqlConcurrencyControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSqlConcurrencyControlResponseBody getBody() {
        return this.body;
    }

}
