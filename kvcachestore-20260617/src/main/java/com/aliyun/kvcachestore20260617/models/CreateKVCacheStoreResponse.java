// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class CreateKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKVCacheStoreResponseBody body;

    public static CreateKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKVCacheStoreResponse self = new CreateKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKVCacheStoreResponse setBody(CreateKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
