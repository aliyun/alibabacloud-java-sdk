// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class DeleteKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKVCacheStoreResponseBody body;

    public static DeleteKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKVCacheStoreResponse self = new DeleteKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKVCacheStoreResponse setBody(DeleteKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
