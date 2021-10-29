// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableSqlConcurrencyControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableSqlConcurrencyControlResponse setBody(DisableSqlConcurrencyControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSqlConcurrencyControlResponseBody getBody() {
        return this.body;
    }

}
