// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableSqlConcurrencyControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSqlConcurrencyControlResponseBody body;

    public static EnableSqlConcurrencyControlResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlConcurrencyControlResponse self = new EnableSqlConcurrencyControlResponse();
        return TeaModel.build(map, self);
    }

    public EnableSqlConcurrencyControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSqlConcurrencyControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSqlConcurrencyControlResponse setBody(EnableSqlConcurrencyControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSqlConcurrencyControlResponseBody getBody() {
        return this.body;
    }

}
