// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateIpcOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpcOrderResponseBody body;

    public static CreateIpcOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpcOrderResponse self = new CreateIpcOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpcOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpcOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpcOrderResponse setBody(CreateIpcOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpcOrderResponseBody getBody() {
        return this.body;
    }

}
