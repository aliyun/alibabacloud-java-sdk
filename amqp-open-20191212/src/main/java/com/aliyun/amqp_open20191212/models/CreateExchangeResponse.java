// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateExchangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateExchangeResponse setBody(CreateExchangeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExchangeResponseBody getBody() {
        return this.body;
    }

}
