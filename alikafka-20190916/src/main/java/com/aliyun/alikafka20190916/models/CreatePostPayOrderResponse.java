// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreatePostPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePostPayOrderResponse setBody(CreatePostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePostPayOrderResponseBody getBody() {
        return this.body;
    }

}
