// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateExchangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExchangeResponseBody body;

    public static CreateExchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExchangeResponse self = new CreateExchangeResponse();
        return TeaModel.build(map, self);
    }

    public CreateExchangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExchangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExchangeResponse setBody(CreateExchangeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExchangeResponseBody getBody() {
        return this.body;
    }

}
