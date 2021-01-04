// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterInstanceResponseBody body;

    public static RegisterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceResponse self = new RegisterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterInstanceResponse setBody(RegisterInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterInstanceResponseBody getBody() {
        return this.body;
    }

}
