// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPasswordComplexityConfigurationResponseBody body;

    public static SetPasswordComplexityConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordComplexityConfigurationResponse self = new SetPasswordComplexityConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordComplexityConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordComplexityConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPasswordComplexityConfigurationResponse setBody(SetPasswordComplexityConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordComplexityConfigurationResponseBody getBody() {
        return this.body;
    }

}
