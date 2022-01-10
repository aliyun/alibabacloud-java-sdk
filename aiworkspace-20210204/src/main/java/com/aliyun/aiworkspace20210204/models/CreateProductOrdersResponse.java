// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductOrdersResponseBody body;

    public static CreateProductOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductOrdersResponse self = new CreateProductOrdersResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductOrdersResponse setBody(CreateProductOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductOrdersResponseBody getBody() {
        return this.body;
    }

}
