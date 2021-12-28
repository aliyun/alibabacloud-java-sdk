// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyCenResponseBody body;

    public static VerifyCenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCenResponse self = new VerifyCenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCenResponse setBody(VerifyCenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCenResponseBody getBody() {
        return this.body;
    }

}
