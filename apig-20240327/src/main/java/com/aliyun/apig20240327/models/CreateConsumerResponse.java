// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsumerResponseBody body;

    public static CreateConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerResponse self = new CreateConsumerResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerResponse setBody(CreateConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerResponseBody getBody() {
        return this.body;
    }

}
