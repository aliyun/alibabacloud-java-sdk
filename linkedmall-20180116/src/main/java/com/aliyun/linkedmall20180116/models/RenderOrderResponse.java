// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenderOrderResponseBody body;

    public static RenderOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderResponse self = new RenderOrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderOrderResponse setBody(RenderOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RenderOrderResponseBody getBody() {
        return this.body;
    }

}
