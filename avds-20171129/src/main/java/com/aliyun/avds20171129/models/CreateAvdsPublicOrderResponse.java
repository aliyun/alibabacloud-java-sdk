// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsPublicOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAvdsPublicOrderResponseBody body;

    public static CreateAvdsPublicOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsPublicOrderResponse self = new CreateAvdsPublicOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAvdsPublicOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAvdsPublicOrderResponse setBody(CreateAvdsPublicOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAvdsPublicOrderResponseBody getBody() {
        return this.body;
    }

}
