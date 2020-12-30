// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitEmailVerificationResponseBody body;

    public static SubmitEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEmailVerificationResponse self = new SubmitEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEmailVerificationResponse setBody(SubmitEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
