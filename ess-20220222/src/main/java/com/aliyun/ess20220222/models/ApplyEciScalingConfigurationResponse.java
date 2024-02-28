// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyEciScalingConfigurationResponseBody body;

    public static ApplyEciScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyEciScalingConfigurationResponse self = new ApplyEciScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyEciScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyEciScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyEciScalingConfigurationResponse setBody(ApplyEciScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyEciScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
