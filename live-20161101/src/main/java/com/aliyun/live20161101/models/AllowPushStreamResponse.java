// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AllowPushStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllowPushStreamResponseBody body;

    public static AllowPushStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        AllowPushStreamResponse self = new AllowPushStreamResponse();
        return TeaModel.build(map, self);
    }

    public AllowPushStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllowPushStreamResponse setBody(AllowPushStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public AllowPushStreamResponseBody getBody() {
        return this.body;
    }

}
