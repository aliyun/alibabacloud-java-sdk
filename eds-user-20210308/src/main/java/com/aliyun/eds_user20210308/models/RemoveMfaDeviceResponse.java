// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveMfaDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMfaDeviceResponseBody body;

    public static RemoveMfaDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMfaDeviceResponse self = new RemoveMfaDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMfaDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMfaDeviceResponse setBody(RemoveMfaDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMfaDeviceResponseBody getBody() {
        return this.body;
    }

}
