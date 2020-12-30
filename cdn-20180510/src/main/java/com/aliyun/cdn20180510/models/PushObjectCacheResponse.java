// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PushObjectCacheResponse setBody(PushObjectCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public PushObjectCacheResponseBody getBody() {
        return this.body;
    }

}
