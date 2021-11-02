// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateVirtualProductOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVirtualProductOrderResponseBody body;

    public static CreateVirtualProductOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualProductOrderResponse self = new CreateVirtualProductOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualProductOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualProductOrderResponse setBody(CreateVirtualProductOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualProductOrderResponseBody getBody() {
        return this.body;
    }

}
