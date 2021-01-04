// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateTransmitLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransmitLineResponseBody body;

    public static CreateTransmitLineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransmitLineResponse self = new CreateTransmitLineResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransmitLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransmitLineResponse setBody(CreateTransmitLineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransmitLineResponseBody getBody() {
        return this.body;
    }

}
