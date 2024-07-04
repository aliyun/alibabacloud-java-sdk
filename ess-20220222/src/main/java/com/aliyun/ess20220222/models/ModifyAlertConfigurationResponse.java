// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlertConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAlertConfigurationResponseBody body;

    public static ModifyAlertConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertConfigurationResponse self = new ModifyAlertConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAlertConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAlertConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAlertConfigurationResponse setBody(ModifyAlertConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAlertConfigurationResponseBody getBody() {
        return this.body;
    }

}
