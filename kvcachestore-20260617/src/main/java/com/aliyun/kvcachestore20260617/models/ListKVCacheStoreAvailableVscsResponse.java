// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableVscsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKVCacheStoreAvailableVscsResponseBody body;

    public static ListKVCacheStoreAvailableVscsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableVscsResponse self = new ListKVCacheStoreAvailableVscsResponse();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableVscsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKVCacheStoreAvailableVscsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKVCacheStoreAvailableVscsResponse setBody(ListKVCacheStoreAvailableVscsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKVCacheStoreAvailableVscsResponseBody getBody() {
        return this.body;
    }

}
