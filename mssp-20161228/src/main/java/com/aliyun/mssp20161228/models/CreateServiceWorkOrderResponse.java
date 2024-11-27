// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class CreateServiceWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceWorkOrderResponseBody body;

    public static CreateServiceWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceWorkOrderResponse self = new CreateServiceWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceWorkOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceWorkOrderResponse setBody(CreateServiceWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceWorkOrderResponseBody getBody() {
        return this.body;
    }

}
