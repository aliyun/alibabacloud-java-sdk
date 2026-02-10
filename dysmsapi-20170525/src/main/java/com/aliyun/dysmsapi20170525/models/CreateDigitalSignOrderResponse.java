// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSignOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalSignOrderResponseBody body;

    public static CreateDigitalSignOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSignOrderResponse self = new CreateDigitalSignOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSignOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalSignOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalSignOrderResponse setBody(CreateDigitalSignOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalSignOrderResponseBody getBody() {
        return this.body;
    }

}
