// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubBroadcastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PubBroadcastResponseBody body;

    public static PubBroadcastResponse build(java.util.Map<String, ?> map) throws Exception {
        PubBroadcastResponse self = new PubBroadcastResponse();
        return TeaModel.build(map, self);
    }

    public PubBroadcastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PubBroadcastResponse setBody(PubBroadcastResponseBody body) {
        this.body = body;
        return this;
    }
    public PubBroadcastResponseBody getBody() {
        return this.body;
    }

}
