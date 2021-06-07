// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockMfaDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LockMfaDeviceResponseBody body;

    public static LockMfaDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockMfaDeviceResponse self = new LockMfaDeviceResponse();
        return TeaModel.build(map, self);
    }

    public LockMfaDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockMfaDeviceResponse setBody(LockMfaDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public LockMfaDeviceResponseBody getBody() {
        return this.body;
    }

}
