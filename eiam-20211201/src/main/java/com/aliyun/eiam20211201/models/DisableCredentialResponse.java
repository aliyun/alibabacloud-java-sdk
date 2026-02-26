// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCredentialResponseBody body;

    public static DisableCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCredentialResponse self = new DisableCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DisableCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCredentialResponse setBody(DisableCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCredentialResponseBody getBody() {
        return this.body;
    }

}
