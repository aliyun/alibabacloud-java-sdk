// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCredentialResponseBody body;

    public static EnableCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCredentialResponse self = new EnableCredentialResponse();
        return TeaModel.build(map, self);
    }

    public EnableCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCredentialResponse setBody(EnableCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCredentialResponseBody getBody() {
        return this.body;
    }

}
