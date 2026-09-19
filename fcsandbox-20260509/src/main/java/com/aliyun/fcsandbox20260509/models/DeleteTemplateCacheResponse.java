// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteTemplateCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTemplateCacheResponseBody body;

    public static DeleteTemplateCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateCacheResponse self = new DeleteTemplateCacheResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplateCacheResponse setBody(DeleteTemplateCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateCacheResponseBody getBody() {
        return this.body;
    }

}
