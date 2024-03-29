// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class UpdateAuthenticatorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthenticatorAttributeResponseBody body;

    public static UpdateAuthenticatorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthenticatorAttributeResponse self = new UpdateAuthenticatorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthenticatorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthenticatorAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthenticatorAttributeResponse setBody(UpdateAuthenticatorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthenticatorAttributeResponseBody getBody() {
        return this.body;
    }

}
