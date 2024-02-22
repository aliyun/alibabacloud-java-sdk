// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTokenResponseBody body;

    public static CreateTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponse self = new CreateTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTokenResponse setBody(CreateTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTokenResponseBody getBody() {
        return this.body;
    }

}
