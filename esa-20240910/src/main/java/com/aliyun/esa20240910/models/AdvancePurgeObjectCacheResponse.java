// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AdvancePurgeObjectCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdvancePurgeObjectCacheResponseBody body;

    public static AdvancePurgeObjectCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        AdvancePurgeObjectCacheResponse self = new AdvancePurgeObjectCacheResponse();
        return TeaModel.build(map, self);
    }

    public AdvancePurgeObjectCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdvancePurgeObjectCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdvancePurgeObjectCacheResponse setBody(AdvancePurgeObjectCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public AdvancePurgeObjectCacheResponseBody getBody() {
        return this.body;
    }

}
