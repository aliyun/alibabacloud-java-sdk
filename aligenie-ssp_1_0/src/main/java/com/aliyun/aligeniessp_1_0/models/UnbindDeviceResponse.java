// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindDeviceResponseBody body;

    public static UnbindDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceResponse self = new UnbindDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDeviceResponse setBody(UnbindDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDeviceResponseBody getBody() {
        return this.body;
    }

}
