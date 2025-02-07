// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTieredCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTieredCacheResponseBody body;

    public static UpdateTieredCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTieredCacheResponse self = new UpdateTieredCacheResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTieredCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTieredCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTieredCacheResponse setBody(UpdateTieredCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTieredCacheResponseBody getBody() {
        return this.body;
    }

}
