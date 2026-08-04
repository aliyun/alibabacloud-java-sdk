// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DelCacheOperateSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelCacheOperateSyncResponseBody body;

    public static DelCacheOperateSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DelCacheOperateSyncResponse self = new DelCacheOperateSyncResponse();
        return TeaModel.build(map, self);
    }

    public DelCacheOperateSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelCacheOperateSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelCacheOperateSyncResponse setBody(DelCacheOperateSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DelCacheOperateSyncResponseBody getBody() {
        return this.body;
    }

}
