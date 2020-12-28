// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePrePayOrderResponseBody body;

    public static CreatePrePayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayOrderResponse self = new CreatePrePayOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrePayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrePayOrderResponse setBody(CreatePrePayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrePayOrderResponseBody getBody() {
        return this.body;
    }

}
