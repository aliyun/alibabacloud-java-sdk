// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class RefreshResolveCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshResolveCacheResponseBody body;

    public static RefreshResolveCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshResolveCacheResponse self = new RefreshResolveCacheResponse();
        return TeaModel.build(map, self);
    }

    public RefreshResolveCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshResolveCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshResolveCacheResponse setBody(RefreshResolveCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshResolveCacheResponseBody getBody() {
        return this.body;
    }

}
