// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMixStreamResponseBody body;

    public static CreateMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamResponse self = new CreateMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMixStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMixStreamResponse setBody(CreateMixStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMixStreamResponseBody getBody() {
        return this.body;
    }

}
