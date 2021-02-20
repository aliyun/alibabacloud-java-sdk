// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAvdsOrderResponseBody body;

    public static CreateAvdsOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsOrderResponse self = new CreateAvdsOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAvdsOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAvdsOrderResponse setBody(CreateAvdsOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAvdsOrderResponseBody getBody() {
        return this.body;
    }

}
