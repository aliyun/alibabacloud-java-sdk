// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesByCacheTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshErObjectCachesByCacheTagResponseBody body;

    public static RefreshErObjectCachesByCacheTagResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesByCacheTagResponse self = new RefreshErObjectCachesByCacheTagResponse();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesByCacheTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshErObjectCachesByCacheTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshErObjectCachesByCacheTagResponse setBody(RefreshErObjectCachesByCacheTagResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshErObjectCachesByCacheTagResponseBody getBody() {
        return this.body;
    }

}
