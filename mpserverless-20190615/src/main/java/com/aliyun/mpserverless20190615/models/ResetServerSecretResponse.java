// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ResetServerSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetServerSecretResponseBody body;

    public static ResetServerSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetServerSecretResponse self = new ResetServerSecretResponse();
        return TeaModel.build(map, self);
    }

    public ResetServerSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetServerSecretResponse setBody(ResetServerSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetServerSecretResponseBody getBody() {
        return this.body;
    }

}
