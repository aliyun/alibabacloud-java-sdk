// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushVersionMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushVersionMessageResponseBody body;

    public static PushVersionMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushVersionMessageResponse self = new PushVersionMessageResponse();
        return TeaModel.build(map, self);
    }

    public PushVersionMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushVersionMessageResponse setBody(PushVersionMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PushVersionMessageResponseBody getBody() {
        return this.body;
    }

}
