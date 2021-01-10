// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidLiveStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ForbidLiveStreamResponseBody body;

    public static ForbidLiveStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbidLiveStreamResponse self = new ForbidLiveStreamResponse();
        return TeaModel.build(map, self);
    }

    public ForbidLiveStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForbidLiveStreamResponse setBody(ForbidLiveStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbidLiveStreamResponseBody getBody() {
        return this.body;
    }

}
