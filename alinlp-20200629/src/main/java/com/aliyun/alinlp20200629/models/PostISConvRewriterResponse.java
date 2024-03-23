// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISConvRewriterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostISConvRewriterResponseBody body;

    public static PostISConvRewriterResponse build(java.util.Map<String, ?> map) throws Exception {
        PostISConvRewriterResponse self = new PostISConvRewriterResponse();
        return TeaModel.build(map, self);
    }

    public PostISConvRewriterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostISConvRewriterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostISConvRewriterResponse setBody(PostISConvRewriterResponseBody body) {
        this.body = body;
        return this;
    }
    public PostISConvRewriterResponseBody getBody() {
        return this.body;
    }

}
