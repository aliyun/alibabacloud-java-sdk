// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteDomainProxyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainProxyTokenResponseBody body;

    public static DeleteDomainProxyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainProxyTokenResponse self = new DeleteDomainProxyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainProxyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainProxyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainProxyTokenResponse setBody(DeleteDomainProxyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainProxyTokenResponseBody getBody() {
        return this.body;
    }

}
