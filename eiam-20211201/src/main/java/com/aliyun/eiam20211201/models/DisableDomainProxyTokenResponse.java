// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableDomainProxyTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDomainProxyTokenResponseBody body;

    public static DisableDomainProxyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDomainProxyTokenResponse self = new DisableDomainProxyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DisableDomainProxyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDomainProxyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDomainProxyTokenResponse setBody(DisableDomainProxyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDomainProxyTokenResponseBody getBody() {
        return this.body;
    }

}
