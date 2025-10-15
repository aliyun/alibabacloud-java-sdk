// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationTokenResponseBody body;

    public static DisableApplicationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationTokenResponse self = new DisableApplicationTokenResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationTokenResponse setBody(DisableApplicationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationTokenResponseBody getBody() {
        return this.body;
    }

}
