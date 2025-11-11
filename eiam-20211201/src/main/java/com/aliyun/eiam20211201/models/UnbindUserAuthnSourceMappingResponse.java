// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnbindUserAuthnSourceMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindUserAuthnSourceMappingResponseBody body;

    public static UnbindUserAuthnSourceMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserAuthnSourceMappingResponse self = new UnbindUserAuthnSourceMappingResponse();
        return TeaModel.build(map, self);
    }

    public UnbindUserAuthnSourceMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindUserAuthnSourceMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindUserAuthnSourceMappingResponse setBody(UnbindUserAuthnSourceMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindUserAuthnSourceMappingResponseBody getBody() {
        return this.body;
    }

}
