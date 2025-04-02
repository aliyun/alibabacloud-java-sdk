// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskSubmitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PodcastTaskSubmitResponseBody body;

    public static PodcastTaskSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskSubmitResponse self = new PodcastTaskSubmitResponse();
        return TeaModel.build(map, self);
    }

    public PodcastTaskSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PodcastTaskSubmitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PodcastTaskSubmitResponse setBody(PodcastTaskSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public PodcastTaskSubmitResponseBody getBody() {
        return this.body;
    }

}
