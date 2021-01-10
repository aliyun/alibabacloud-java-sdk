// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ResumeLiveStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeLiveStreamResponseBody body;

    public static ResumeLiveStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeLiveStreamResponse self = new ResumeLiveStreamResponse();
        return TeaModel.build(map, self);
    }

    public ResumeLiveStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeLiveStreamResponse setBody(ResumeLiveStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeLiveStreamResponseBody getBody() {
        return this.body;
    }

}
