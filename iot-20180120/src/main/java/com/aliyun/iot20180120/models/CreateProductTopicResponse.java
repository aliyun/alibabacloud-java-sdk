// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductTopicResponseBody body;

    public static CreateProductTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTopicResponse self = new CreateProductTopicResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductTopicResponse setBody(CreateProductTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductTopicResponseBody getBody() {
        return this.body;
    }

}
