// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class SendOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendOrderResponseBody body;

    public static SendOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SendOrderResponse self = new SendOrderResponse();
        return TeaModel.build(map, self);
    }

    public SendOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendOrderResponse setBody(SendOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SendOrderResponseBody getBody() {
        return this.body;
    }

}
