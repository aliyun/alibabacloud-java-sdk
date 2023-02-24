// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CrossAccountVerifyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CrossAccountVerifyTokenResponseBody body;

    public static CrossAccountVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CrossAccountVerifyTokenResponse self = new CrossAccountVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public CrossAccountVerifyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CrossAccountVerifyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CrossAccountVerifyTokenResponse setBody(CrossAccountVerifyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CrossAccountVerifyTokenResponseBody getBody() {
        return this.body;
    }

}
