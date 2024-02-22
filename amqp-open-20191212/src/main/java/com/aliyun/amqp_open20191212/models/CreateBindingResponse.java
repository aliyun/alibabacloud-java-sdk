// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBindingResponseBody body;

    public static CreateBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingResponse self = new CreateBindingResponse();
        return TeaModel.build(map, self);
    }

    public CreateBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBindingResponse setBody(CreateBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBindingResponseBody getBody() {
        return this.body;
    }

}
