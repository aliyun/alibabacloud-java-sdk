// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableInternalAuthenticationSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInternalAuthenticationSourceResponseBody body;

    public static DisableInternalAuthenticationSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInternalAuthenticationSourceResponse self = new DisableInternalAuthenticationSourceResponse();
        return TeaModel.build(map, self);
    }

    public DisableInternalAuthenticationSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInternalAuthenticationSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInternalAuthenticationSourceResponse setBody(DisableInternalAuthenticationSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInternalAuthenticationSourceResponseBody getBody() {
        return this.body;
    }

}
