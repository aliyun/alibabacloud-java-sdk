// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordExpirationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetPasswordExpirationConfigurationResponseBody body;

    public static SetPasswordExpirationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordExpirationConfigurationResponse self = new SetPasswordExpirationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordExpirationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordExpirationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPasswordExpirationConfigurationResponse setBody(SetPasswordExpirationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordExpirationConfigurationResponseBody getBody() {
        return this.body;
    }

}
