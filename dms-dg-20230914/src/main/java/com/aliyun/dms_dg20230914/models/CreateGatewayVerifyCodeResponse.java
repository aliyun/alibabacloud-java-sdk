// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class CreateGatewayVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayVerifyCodeResponseBody body;

    public static CreateGatewayVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayVerifyCodeResponse self = new CreateGatewayVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayVerifyCodeResponse setBody(CreateGatewayVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
