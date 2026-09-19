// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTemplateCacheResponseBody body;

    public static CreateTemplateCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCacheResponse self = new CreateTemplateCacheResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTemplateCacheResponse setBody(CreateTemplateCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateCacheResponseBody getBody() {
        return this.body;
    }

}
