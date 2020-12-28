// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePostPayOrderResponseBody body;

    public static CreatePostPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayOrderResponse self = new CreatePostPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePostPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePostPayOrderResponse setBody(CreatePostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePostPayOrderResponseBody getBody() {
        return this.body;
    }

}
