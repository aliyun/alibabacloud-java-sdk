// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class BindUserAuthnSourceMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindUserAuthnSourceMappingResponseBody body;

    public static BindUserAuthnSourceMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        BindUserAuthnSourceMappingResponse self = new BindUserAuthnSourceMappingResponse();
        return TeaModel.build(map, self);
    }

    public BindUserAuthnSourceMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindUserAuthnSourceMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindUserAuthnSourceMappingResponse setBody(BindUserAuthnSourceMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public BindUserAuthnSourceMappingResponseBody getBody() {
        return this.body;
    }

}
