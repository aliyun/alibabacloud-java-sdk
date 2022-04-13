// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderPayUrlForOutDiscountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateOrderPayUrlForOutDiscountResponse setBody(CreateOrderPayUrlForOutDiscountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderPayUrlForOutDiscountResponseBody getBody() {
        return this.body;
    }

}
