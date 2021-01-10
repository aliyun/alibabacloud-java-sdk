// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidPushStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ForbidPushStreamResponseBody body;

    public static ForbidPushStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbidPushStreamResponse self = new ForbidPushStreamResponse();
        return TeaModel.build(map, self);
    }

    public ForbidPushStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForbidPushStreamResponse setBody(ForbidPushStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbidPushStreamResponseBody getBody() {
        return this.body;
    }

}
