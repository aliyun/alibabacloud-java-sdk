// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskBuyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiskBuyOrderResponseBody body;

    public static CreateDiskBuyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskBuyOrderResponse self = new CreateDiskBuyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskBuyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskBuyOrderResponse setBody(CreateDiskBuyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskBuyOrderResponseBody getBody() {
        return this.body;
    }

}
