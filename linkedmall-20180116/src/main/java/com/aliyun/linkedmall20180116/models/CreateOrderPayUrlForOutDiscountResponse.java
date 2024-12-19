// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderPayUrlForOutDiscountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrderPayUrlForOutDiscountResponseBody body;

    public static CreateOrderPayUrlForOutDiscountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderPayUrlForOutDiscountResponse self = new CreateOrderPayUrlForOutDiscountResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderPayUrlForOutDiscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderPayUrlForOutDiscountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderPayUrlForOutDiscountResponse setBody(CreateOrderPayUrlForOutDiscountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderPayUrlForOutDiscountResponseBody getBody() {
        return this.body;
    }

}
