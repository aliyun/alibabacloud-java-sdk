// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ValidateOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateOrderResponseBody body;

    public static ValidateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateOrderResponse self = new ValidateOrderResponse();
        return TeaModel.build(map, self);
    }

    public ValidateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateOrderResponse setBody(ValidateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateOrderResponseBody getBody() {
        return this.body;
    }

}
