// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateOpenSourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenSourceAccountResponseBody body;

    public static CreateOpenSourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSourceAccountResponse self = new CreateOpenSourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenSourceAccountResponse setBody(CreateOpenSourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSourceAccountResponseBody getBody() {
        return this.body;
    }

}
