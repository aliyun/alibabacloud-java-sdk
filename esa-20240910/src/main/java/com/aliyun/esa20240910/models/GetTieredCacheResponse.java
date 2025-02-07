// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTieredCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTieredCacheResponseBody body;

    public static GetTieredCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTieredCacheResponse self = new GetTieredCacheResponse();
        return TeaModel.build(map, self);
    }

    public GetTieredCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTieredCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTieredCacheResponse setBody(GetTieredCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTieredCacheResponseBody getBody() {
        return this.body;
    }

}
