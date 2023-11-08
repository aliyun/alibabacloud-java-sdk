// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteExchangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExchangeResponseBody body;

    public static DeleteExchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExchangeResponse self = new DeleteExchangeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExchangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExchangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExchangeResponse setBody(DeleteExchangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExchangeResponseBody getBody() {
        return this.body;
    }

}
