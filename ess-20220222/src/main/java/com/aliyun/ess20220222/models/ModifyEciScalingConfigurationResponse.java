// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyEciScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEciScalingConfigurationResponseBody body;

    public static ModifyEciScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEciScalingConfigurationResponse self = new ModifyEciScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEciScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEciScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEciScalingConfigurationResponse setBody(ModifyEciScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEciScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
