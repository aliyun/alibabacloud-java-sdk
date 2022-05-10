// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishRealResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishRealResponseBody body;

    public static PublishRealResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRealResponse self = new PublishRealResponse();
        return TeaModel.build(map, self);
    }

    public PublishRealResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRealResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRealResponse setBody(PublishRealResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRealResponseBody getBody() {
        return this.body;
    }

}
