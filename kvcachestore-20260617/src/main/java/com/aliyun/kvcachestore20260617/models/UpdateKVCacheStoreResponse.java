// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class UpdateKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKVCacheStoreResponseBody body;

    public static UpdateKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKVCacheStoreResponse self = new UpdateKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKVCacheStoreResponse setBody(UpdateKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
