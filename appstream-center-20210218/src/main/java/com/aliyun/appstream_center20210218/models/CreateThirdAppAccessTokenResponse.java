// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class CreateThirdAppAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateThirdAppAccessTokenResponseBody body;

    public static CreateThirdAppAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdAppAccessTokenResponse self = new CreateThirdAppAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateThirdAppAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateThirdAppAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateThirdAppAccessTokenResponse setBody(CreateThirdAppAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThirdAppAccessTokenResponseBody getBody() {
        return this.body;
    }

}
