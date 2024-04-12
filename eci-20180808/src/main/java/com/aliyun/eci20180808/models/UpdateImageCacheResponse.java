// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateImageCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageCacheResponseBody body;

    public static UpdateImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageCacheResponse self = new UpdateImageCacheResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageCacheResponse setBody(UpdateImageCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageCacheResponseBody getBody() {
        return this.body;
    }

}
