// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class SetCacheOperateSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCacheOperateSyncResponseBody body;

    public static SetCacheOperateSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCacheOperateSyncResponse self = new SetCacheOperateSyncResponse();
        return TeaModel.build(map, self);
    }

    public SetCacheOperateSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCacheOperateSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCacheOperateSyncResponse setBody(SetCacheOperateSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCacheOperateSyncResponseBody getBody() {
        return this.body;
    }

}
