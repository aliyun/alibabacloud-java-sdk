// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateUmengTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUmengTokenResponseBody body;

    public static CreateUmengTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUmengTokenResponse self = new CreateUmengTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateUmengTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUmengTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUmengTokenResponse setBody(CreateUmengTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUmengTokenResponseBody getBody() {
        return this.body;
    }

}
