// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class AttachKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachKVCacheStoreResponseBody body;

    public static AttachKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachKVCacheStoreResponse self = new AttachKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public AttachKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachKVCacheStoreResponse setBody(AttachKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
