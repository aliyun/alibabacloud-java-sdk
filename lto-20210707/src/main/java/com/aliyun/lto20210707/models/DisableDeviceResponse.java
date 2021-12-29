// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDeviceResponseBody body;

    public static DisableDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceResponse self = new DisableDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeviceResponse setBody(DisableDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeviceResponseBody getBody() {
        return this.body;
    }

}
