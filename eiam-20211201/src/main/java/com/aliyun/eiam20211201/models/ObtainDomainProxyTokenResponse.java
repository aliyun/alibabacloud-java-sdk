// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainDomainProxyTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainDomainProxyTokenResponseBody body;

    public static ObtainDomainProxyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainDomainProxyTokenResponse self = new ObtainDomainProxyTokenResponse();
        return TeaModel.build(map, self);
    }

    public ObtainDomainProxyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainDomainProxyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainDomainProxyTokenResponse setBody(ObtainDomainProxyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainDomainProxyTokenResponseBody getBody() {
        return this.body;
    }

}
