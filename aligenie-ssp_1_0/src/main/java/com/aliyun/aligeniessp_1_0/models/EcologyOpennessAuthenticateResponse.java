// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessAuthenticateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EcologyOpennessAuthenticateResponseBody body;

    public static EcologyOpennessAuthenticateResponse build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessAuthenticateResponse self = new EcologyOpennessAuthenticateResponse();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessAuthenticateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EcologyOpennessAuthenticateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EcologyOpennessAuthenticateResponse setBody(EcologyOpennessAuthenticateResponseBody body) {
        this.body = body;
        return this;
    }
    public EcologyOpennessAuthenticateResponseBody getBody() {
        return this.body;
    }

}
