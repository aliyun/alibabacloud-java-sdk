// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCacheByCacheTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshDcdnObjectCacheByCacheTagResponseBody body;

    public static RefreshDcdnObjectCacheByCacheTagResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCacheByCacheTagResponse self = new RefreshDcdnObjectCacheByCacheTagResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCacheByCacheTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDcdnObjectCacheByCacheTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDcdnObjectCacheByCacheTagResponse setBody(RefreshDcdnObjectCacheByCacheTagResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDcdnObjectCacheByCacheTagResponseBody getBody() {
        return this.body;
    }

}
