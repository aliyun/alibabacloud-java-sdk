// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetWebAuthnConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWebAuthnConfigurationResponseBody body;

    public static SetWebAuthnConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWebAuthnConfigurationResponse self = new SetWebAuthnConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetWebAuthnConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWebAuthnConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWebAuthnConfigurationResponse setBody(SetWebAuthnConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWebAuthnConfigurationResponseBody getBody() {
        return this.body;
    }

}
