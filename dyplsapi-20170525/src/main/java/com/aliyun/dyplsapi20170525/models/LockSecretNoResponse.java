// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class LockSecretNoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LockSecretNoResponseBody body;

    public static LockSecretNoResponse build(java.util.Map<String, ?> map) throws Exception {
        LockSecretNoResponse self = new LockSecretNoResponse();
        return TeaModel.build(map, self);
    }

    public LockSecretNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockSecretNoResponse setBody(LockSecretNoResponseBody body) {
        this.body = body;
        return this;
    }
    public LockSecretNoResponseBody getBody() {
        return this.body;
    }

}
