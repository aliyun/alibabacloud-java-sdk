// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISRerankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostISRerankResponseBody body;

    public static PostISRerankResponse build(java.util.Map<String, ?> map) throws Exception {
        PostISRerankResponse self = new PostISRerankResponse();
        return TeaModel.build(map, self);
    }

    public PostISRerankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostISRerankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostISRerankResponse setBody(PostISRerankResponseBody body) {
        this.body = body;
        return this;
    }
    public PostISRerankResponseBody getBody() {
        return this.body;
    }

}
