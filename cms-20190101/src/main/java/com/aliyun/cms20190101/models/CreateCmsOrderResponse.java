// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCmsOrderResponseBody body;

    public static CreateCmsOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsOrderResponse self = new CreateCmsOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCmsOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCmsOrderResponse setBody(CreateCmsOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsOrderResponseBody getBody() {
        return this.body;
    }

}
