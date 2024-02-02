// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public LaunchAuthenticationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchAuthenticationResponse setBody(LaunchAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchAuthenticationResponseBody getBody() {
        return this.body;
    }

}
