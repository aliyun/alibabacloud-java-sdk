// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishRasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishRasterResponseBody body;

    public static PublishRasterResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRasterResponse self = new PublishRasterResponse();
        return TeaModel.build(map, self);
    }

    public PublishRasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRasterResponse setBody(PublishRasterResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRasterResponseBody getBody() {
        return this.body;
    }

}
