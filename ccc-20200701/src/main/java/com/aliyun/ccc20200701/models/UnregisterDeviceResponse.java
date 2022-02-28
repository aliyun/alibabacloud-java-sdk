// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UnregisterDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterDeviceResponseBody body;

    public static UnregisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDeviceResponse self = new UnregisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterDeviceResponse setBody(UnregisterDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterDeviceResponseBody getBody() {
        return this.body;
    }

}
