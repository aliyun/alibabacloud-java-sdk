// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RevealServiceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevealServiceCredentialResponseBody body;

    public static RevealServiceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        RevealServiceCredentialResponse self = new RevealServiceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public RevealServiceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevealServiceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevealServiceCredentialResponse setBody(RevealServiceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RevealServiceCredentialResponseBody getBody() {
        return this.body;
    }

}
