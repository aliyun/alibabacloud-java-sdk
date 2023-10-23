// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class EnableStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableStorageOrderResponseBody body;

    public static EnableStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableStorageOrderResponse self = new EnableStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public EnableStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableStorageOrderResponse setBody(EnableStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableStorageOrderResponseBody getBody() {
        return this.body;
    }

}
