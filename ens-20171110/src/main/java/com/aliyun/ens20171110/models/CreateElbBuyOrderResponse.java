// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateElbBuyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateElbBuyOrderResponseBody body;

    public static CreateElbBuyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElbBuyOrderResponse self = new CreateElbBuyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateElbBuyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElbBuyOrderResponse setBody(CreateElbBuyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElbBuyOrderResponseBody getBody() {
        return this.body;
    }

}
