// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVhostResponseBody body;

    public static CreateVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVhostResponse self = new CreateVhostResponse();
        return TeaModel.build(map, self);
    }

    public CreateVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVhostResponse setBody(CreateVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVhostResponseBody getBody() {
        return this.body;
    }

}
