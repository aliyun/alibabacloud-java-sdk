// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyIdTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyIdTokenResponseBody body;

    public static VerifyIdTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyIdTokenResponse self = new VerifyIdTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyIdTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyIdTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyIdTokenResponse setBody(VerifyIdTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyIdTokenResponseBody getBody() {
        return this.body;
    }

}
