// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBroadcastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushBroadcastResponseBody body;

    public static PushBroadcastResponse build(java.util.Map<String, ?> map) throws Exception {
        PushBroadcastResponse self = new PushBroadcastResponse();
        return TeaModel.build(map, self);
    }

    public PushBroadcastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushBroadcastResponse setBody(PushBroadcastResponseBody body) {
        this.body = body;
        return this;
    }
    public PushBroadcastResponseBody getBody() {
        return this.body;
    }

}
