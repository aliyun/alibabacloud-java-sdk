// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SyncPaymentConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncPaymentConfigResponseBody body;

    public static SyncPaymentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncPaymentConfigResponse self = new SyncPaymentConfigResponse();
        return TeaModel.build(map, self);
    }

    public SyncPaymentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncPaymentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncPaymentConfigResponse setBody(SyncPaymentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncPaymentConfigResponseBody getBody() {
        return this.body;
    }

}
