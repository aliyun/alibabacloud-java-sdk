// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScalingConfigurationResponseBody body;

    public static ModifyScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationResponse self = new ModifyScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScalingConfigurationResponse setBody(ModifyScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
