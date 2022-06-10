// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefuseMerchantSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefuseMerchantSyncTaskResponseBody body;

    public static RefuseMerchantSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseMerchantSyncTaskResponse self = new RefuseMerchantSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public RefuseMerchantSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseMerchantSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefuseMerchantSyncTaskResponse setBody(RefuseMerchantSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseMerchantSyncTaskResponseBody getBody() {
        return this.body;
    }

}
