// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class GetKVCacheStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKVCacheStoreResponseBody body;

    public static GetKVCacheStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKVCacheStoreResponse self = new GetKVCacheStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetKVCacheStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKVCacheStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKVCacheStoreResponse setBody(GetKVCacheStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKVCacheStoreResponseBody getBody() {
        return this.body;
    }

}
