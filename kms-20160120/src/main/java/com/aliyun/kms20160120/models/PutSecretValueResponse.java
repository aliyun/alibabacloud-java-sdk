// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutSecretValueResponseBody body;

    public static PutSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueResponse self = new PutSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public PutSecretValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutSecretValueResponse setBody(PutSecretValueResponseBody body) {
        this.body = body;
        return this;
    }
    public PutSecretValueResponseBody getBody() {
        return this.body;
    }

}
