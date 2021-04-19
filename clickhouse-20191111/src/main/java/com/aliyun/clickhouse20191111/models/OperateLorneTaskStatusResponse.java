// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLorneTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateLorneTaskStatusResponseBody body;

    public static OperateLorneTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateLorneTaskStatusResponse self = new OperateLorneTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public OperateLorneTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateLorneTaskStatusResponse setBody(OperateLorneTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateLorneTaskStatusResponseBody getBody() {
        return this.body;
    }

}
