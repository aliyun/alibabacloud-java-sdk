// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetForgetPasswordConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetForgetPasswordConfigurationResponseBody body;

    public static SetForgetPasswordConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetForgetPasswordConfigurationResponse self = new SetForgetPasswordConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetForgetPasswordConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetForgetPasswordConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetForgetPasswordConfigurationResponse setBody(SetForgetPasswordConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetForgetPasswordConfigurationResponseBody getBody() {
        return this.body;
    }

}
