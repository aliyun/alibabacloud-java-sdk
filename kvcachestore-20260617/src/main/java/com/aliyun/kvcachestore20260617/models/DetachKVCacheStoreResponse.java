// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class DetachKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachKVCacheStoreResponseBody body;

    public static DetachKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachKVCacheStoreResponse self = new DetachKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public DetachKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachKVCacheStoreResponse setBody(DetachKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
