// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class CreateAndPayStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAndPayStorageOrderResponseBody body;

    public static CreateAndPayStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPayStorageOrderResponse self = new CreateAndPayStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndPayStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndPayStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndPayStorageOrderResponse setBody(CreateAndPayStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndPayStorageOrderResponseBody getBody() {
        return this.body;
    }

}
