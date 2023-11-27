// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLoginTokenResponseBody body;

    public static GetLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponse self = new GetLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginTokenResponse setBody(GetLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginTokenResponseBody getBody() {
        return this.body;
    }

}
