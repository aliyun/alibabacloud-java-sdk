// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class CreateOrderIapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderIapResponseBody body;

    public static CreateOrderIapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderIapResponse self = new CreateOrderIapResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderIapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderIapResponse setBody(CreateOrderIapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderIapResponseBody getBody() {
        return this.body;
    }

}
