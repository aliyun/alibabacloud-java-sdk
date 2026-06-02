// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class CreateUserAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserAuthConfigResponseBody body;

    public static CreateUserAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthConfigResponse self = new CreateUserAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserAuthConfigResponse setBody(CreateUserAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserAuthConfigResponseBody getBody() {
        return this.body;
    }

}
