// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeveloperResponseBody body;

    public static CreateDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeveloperResponse self = new CreateDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeveloperResponse setBody(CreateDeveloperResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeveloperResponseBody getBody() {
        return this.body;
    }

}
