// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoGenerationResponseBody body;

    public static VideoGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoGenerationResponse self = new VideoGenerationResponse();
        return TeaModel.build(map, self);
    }

    public VideoGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoGenerationResponse setBody(VideoGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoGenerationResponseBody getBody() {
        return this.body;
    }

}
