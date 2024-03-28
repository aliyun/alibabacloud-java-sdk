// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RefreshWebHostingCustomDomainCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshWebHostingCustomDomainCacheResponseBody body;

    public static RefreshWebHostingCustomDomainCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebHostingCustomDomainCacheResponse self = new RefreshWebHostingCustomDomainCacheResponse();
        return TeaModel.build(map, self);
    }

    public RefreshWebHostingCustomDomainCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshWebHostingCustomDomainCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshWebHostingCustomDomainCacheResponse setBody(RefreshWebHostingCustomDomainCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshWebHostingCustomDomainCacheResponseBody getBody() {
        return this.body;
    }

}
