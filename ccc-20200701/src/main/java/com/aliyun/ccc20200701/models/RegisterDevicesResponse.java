// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RegisterDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterDevicesResponseBody body;

    public static RegisterDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDevicesResponse self = new RegisterDevicesResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDevicesResponse setBody(RegisterDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDevicesResponseBody getBody() {
        return this.body;
    }

}
