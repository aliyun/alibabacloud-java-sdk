// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsBagOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAvdsBagOrderResponseBody body;

    public static CreateAvdsBagOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsBagOrderResponse self = new CreateAvdsBagOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAvdsBagOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAvdsBagOrderResponse setBody(CreateAvdsBagOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAvdsBagOrderResponseBody getBody() {
        return this.body;
    }

}
