// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityProxyResponseBody body;

    public static CreateSecurityProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityProxyResponse self = new CreateSecurityProxyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityProxyResponse setBody(CreateSecurityProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityProxyResponseBody getBody() {
        return this.body;
    }

}
