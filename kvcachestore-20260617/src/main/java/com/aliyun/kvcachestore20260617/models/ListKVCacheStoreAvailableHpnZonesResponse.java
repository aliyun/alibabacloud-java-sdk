// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableHpnZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKVCacheStoreAvailableHpnZonesResponseBody body;

    public static ListKVCacheStoreAvailableHpnZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableHpnZonesResponse self = new ListKVCacheStoreAvailableHpnZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableHpnZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKVCacheStoreAvailableHpnZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKVCacheStoreAvailableHpnZonesResponse setBody(ListKVCacheStoreAvailableHpnZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKVCacheStoreAvailableHpnZonesResponseBody getBody() {
        return this.body;
    }

}
