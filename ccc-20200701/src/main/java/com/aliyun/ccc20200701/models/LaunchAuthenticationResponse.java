// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LaunchAuthenticationResponseBody body;

    public static LaunchAuthenticationResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchAuthenticationResponse self = new LaunchAuthenticationResponse();
        return TeaModel.build(map, self);
    }

    public LaunchAuthenticationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchAuthenticationResponse setBody(LaunchAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchAuthenticationResponseBody getBody() {
        return this.body;
    }

}
