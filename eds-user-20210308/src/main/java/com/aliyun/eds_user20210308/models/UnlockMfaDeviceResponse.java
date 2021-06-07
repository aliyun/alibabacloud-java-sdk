// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockMfaDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockMfaDeviceResponseBody body;

    public static UnlockMfaDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockMfaDeviceResponse self = new UnlockMfaDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnlockMfaDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockMfaDeviceResponse setBody(UnlockMfaDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockMfaDeviceResponseBody getBody() {
        return this.body;
    }

}
