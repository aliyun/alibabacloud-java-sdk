// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class CancelOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOrderResponseBody body;

    public static CancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponse self = new CancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrderResponse setBody(CancelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderResponseBody getBody() {
        return this.body;
    }

}
