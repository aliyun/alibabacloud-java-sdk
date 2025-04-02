// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskResultQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PodcastTaskResultQueryResponseBody body;

    public static PodcastTaskResultQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskResultQueryResponse self = new PodcastTaskResultQueryResponse();
        return TeaModel.build(map, self);
    }

    public PodcastTaskResultQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PodcastTaskResultQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PodcastTaskResultQueryResponse setBody(PodcastTaskResultQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public PodcastTaskResultQueryResponseBody getBody() {
        return this.body;
    }

}
