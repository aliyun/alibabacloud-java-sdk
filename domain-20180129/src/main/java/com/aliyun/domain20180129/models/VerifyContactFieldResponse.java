// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyContactFieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyContactFieldResponseBody body;

    public static VerifyContactFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyContactFieldResponse self = new VerifyContactFieldResponse();
        return TeaModel.build(map, self);
    }

    public VerifyContactFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyContactFieldResponse setBody(VerifyContactFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyContactFieldResponseBody getBody() {
        return this.body;
    }

}
