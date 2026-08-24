// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAttachInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKVCacheStoreAttachInfoResponseBody body;

    public static ListKVCacheStoreAttachInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAttachInfoResponse self = new ListKVCacheStoreAttachInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAttachInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKVCacheStoreAttachInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKVCacheStoreAttachInfoResponse setBody(ListKVCacheStoreAttachInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKVCacheStoreAttachInfoResponseBody getBody() {
        return this.body;
    }

}
