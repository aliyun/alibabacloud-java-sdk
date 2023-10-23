// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class FreezeStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FreezeStorageOrderResponseBody body;

    public static FreezeStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeStorageOrderResponse self = new FreezeStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public FreezeStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FreezeStorageOrderResponse setBody(FreezeStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeStorageOrderResponseBody getBody() {
        return this.body;
    }

}
