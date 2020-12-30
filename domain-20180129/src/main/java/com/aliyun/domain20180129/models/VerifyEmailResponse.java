// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyEmailResponseBody body;

    public static VerifyEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyEmailResponse self = new VerifyEmailResponse();
        return TeaModel.build(map, self);
    }

    public VerifyEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyEmailResponse setBody(VerifyEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyEmailResponseBody getBody() {
        return this.body;
    }

}
