// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateOrderForHardwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderForHardwareResponseBody body;

    public static CreateOrderForHardwareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForHardwareResponse self = new CreateOrderForHardwareResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderForHardwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderForHardwareResponse setBody(CreateOrderForHardwareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderForHardwareResponseBody getBody() {
        return this.body;
    }

}
