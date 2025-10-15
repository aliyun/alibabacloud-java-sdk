// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationTokenResponseBody body;

    public static CreateApplicationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTokenResponse self = new CreateApplicationTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationTokenResponse setBody(CreateApplicationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationTokenResponseBody getBody() {
        return this.body;
    }

}
