// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class UpdateAuthenticatorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateAuthenticatorAttributeResponse setBody(UpdateAuthenticatorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthenticatorAttributeResponseBody getBody() {
        return this.body;
    }

}
