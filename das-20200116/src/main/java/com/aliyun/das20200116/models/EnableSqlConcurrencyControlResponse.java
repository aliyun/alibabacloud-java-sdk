// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableSqlConcurrencyControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableSqlConcurrencyControlResponse setBody(EnableSqlConcurrencyControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSqlConcurrencyControlResponseBody getBody() {
        return this.body;
    }

}
