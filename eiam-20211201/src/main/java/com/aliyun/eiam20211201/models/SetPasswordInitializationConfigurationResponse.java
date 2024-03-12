// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordInitializationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPasswordInitializationConfigurationResponseBody body;

    public static SetPasswordInitializationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordInitializationConfigurationResponse self = new SetPasswordInitializationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordInitializationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordInitializationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPasswordInitializationConfigurationResponse setBody(SetPasswordInitializationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordInitializationConfigurationResponseBody getBody() {
        return this.body;
    }

}
