// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class VerifyOwnerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyOwnerInfoResponseBody body;

    public static VerifyOwnerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyOwnerInfoResponse self = new VerifyOwnerInfoResponse();
        return TeaModel.build(map, self);
    }

    public VerifyOwnerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyOwnerInfoResponse setBody(VerifyOwnerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyOwnerInfoResponseBody getBody() {
        return this.body;
    }

}
