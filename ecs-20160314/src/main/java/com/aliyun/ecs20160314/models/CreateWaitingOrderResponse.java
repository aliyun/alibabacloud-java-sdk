// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateWaitingOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWaitingOrderResponseBody body;

    public static CreateWaitingOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingOrderResponse self = new CreateWaitingOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateWaitingOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWaitingOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWaitingOrderResponse setBody(CreateWaitingOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWaitingOrderResponseBody getBody() {
        return this.body;
    }

}
