// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainProxyTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDomainProxyTokenResponseBody body;

    public static CreateDomainProxyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainProxyTokenResponse self = new CreateDomainProxyTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainProxyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainProxyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDomainProxyTokenResponse setBody(CreateDomainProxyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainProxyTokenResponseBody getBody() {
        return this.body;
    }

}
