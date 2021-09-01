// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RegisterEdgeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterEdgeDeviceResponseBody body;

    public static RegisterEdgeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterEdgeDeviceResponse self = new RegisterEdgeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterEdgeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterEdgeDeviceResponse setBody(RegisterEdgeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterEdgeDeviceResponseBody getBody() {
        return this.body;
    }

}
