// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class IncrByCacheOperateSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IncrByCacheOperateSyncResponseBody body;

    public static IncrByCacheOperateSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        IncrByCacheOperateSyncResponse self = new IncrByCacheOperateSyncResponse();
        return TeaModel.build(map, self);
    }

    public IncrByCacheOperateSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncrByCacheOperateSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IncrByCacheOperateSyncResponse setBody(IncrByCacheOperateSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public IncrByCacheOperateSyncResponseBody getBody() {
        return this.body;
    }

}
