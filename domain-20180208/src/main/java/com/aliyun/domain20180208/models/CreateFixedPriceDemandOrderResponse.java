// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceDemandOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFixedPriceDemandOrderResponseBody body;

    public static CreateFixedPriceDemandOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceDemandOrderResponse self = new CreateFixedPriceDemandOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceDemandOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFixedPriceDemandOrderResponse setBody(CreateFixedPriceDemandOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFixedPriceDemandOrderResponseBody getBody() {
        return this.body;
    }

}
