// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class BindStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindStorageOrderResponseBody body;

    public static BindStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BindStorageOrderResponse self = new BindStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public BindStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindStorageOrderResponse setBody(BindStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public BindStorageOrderResponseBody getBody() {
        return this.body;
    }

}
