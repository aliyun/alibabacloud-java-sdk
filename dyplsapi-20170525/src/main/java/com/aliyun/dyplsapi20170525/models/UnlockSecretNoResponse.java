// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnlockSecretNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockSecretNoResponseBody body;

    public static UnlockSecretNoResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockSecretNoResponse self = new UnlockSecretNoResponse();
        return TeaModel.build(map, self);
    }

    public UnlockSecretNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockSecretNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockSecretNoResponse setBody(UnlockSecretNoResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockSecretNoResponseBody getBody() {
        return this.body;
    }

}
