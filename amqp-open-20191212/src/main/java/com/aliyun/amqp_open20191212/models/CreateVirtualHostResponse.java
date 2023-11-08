// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateVirtualHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVirtualHostResponseBody body;

    public static CreateVirtualHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualHostResponse self = new CreateVirtualHostResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualHostResponse setBody(CreateVirtualHostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualHostResponseBody getBody() {
        return this.body;
    }

}
