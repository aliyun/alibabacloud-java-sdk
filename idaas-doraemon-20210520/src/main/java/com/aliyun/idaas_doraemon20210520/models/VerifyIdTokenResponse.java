// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyIdTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public VerifyIdTokenResponse setBody(VerifyIdTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyIdTokenResponseBody getBody() {
        return this.body;
    }

}
