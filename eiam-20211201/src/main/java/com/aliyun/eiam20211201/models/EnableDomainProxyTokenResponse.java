// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableDomainProxyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDomainProxyTokenResponseBody body;

    public static EnableDomainProxyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDomainProxyTokenResponse self = new EnableDomainProxyTokenResponse();
        return TeaModel.build(map, self);
    }

    public EnableDomainProxyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDomainProxyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDomainProxyTokenResponse setBody(EnableDomainProxyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDomainProxyTokenResponseBody getBody() {
        return this.body;
    }

}
