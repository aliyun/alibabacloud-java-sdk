// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ResendEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResendEmailVerificationResponseBody body;

    public static ResendEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailVerificationResponse self = new ResendEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ResendEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendEmailVerificationResponse setBody(ResendEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
