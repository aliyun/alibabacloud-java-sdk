// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMessageAppResponseBody body;

    public static CreateMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageAppResponse self = new CreateMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageAppResponse setBody(CreateMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageAppResponseBody getBody() {
        return this.body;
    }

}
