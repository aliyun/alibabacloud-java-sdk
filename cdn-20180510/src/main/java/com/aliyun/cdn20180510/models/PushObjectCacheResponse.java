// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushObjectCacheResponseBody body;

    public static PushObjectCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheResponse self = new PushObjectCacheResponse();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushObjectCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushObjectCacheResponse setBody(PushObjectCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public PushObjectCacheResponseBody getBody() {
        return this.body;
    }

}
