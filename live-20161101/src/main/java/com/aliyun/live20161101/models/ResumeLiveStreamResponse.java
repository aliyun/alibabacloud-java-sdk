// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ResumeLiveStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ResumeLiveStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeLiveStreamResponse setBody(ResumeLiveStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeLiveStreamResponseBody getBody() {
        return this.body;
    }

}
