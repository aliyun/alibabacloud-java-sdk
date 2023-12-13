// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteImageCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImageCacheResponseBody body;

    public static DeleteImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageCacheResponse self = new DeleteImageCacheResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageCacheResponse setBody(DeleteImageCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageCacheResponseBody getBody() {
        return this.body;
    }

}
