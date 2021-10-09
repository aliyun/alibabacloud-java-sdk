// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class LoginDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LoginDeviceResponseBody body;

    public static LoginDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginDeviceResponse self = new LoginDeviceResponse();
        return TeaModel.build(map, self);
    }

    public LoginDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginDeviceResponse setBody(LoginDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginDeviceResponseBody getBody() {
        return this.body;
    }

}
