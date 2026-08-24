// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKVCacheStoresResponseBody body;

    public static ListKVCacheStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoresResponse self = new ListKVCacheStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKVCacheStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKVCacheStoresResponse setBody(ListKVCacheStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKVCacheStoresResponseBody getBody() {
        return this.body;
    }

}
