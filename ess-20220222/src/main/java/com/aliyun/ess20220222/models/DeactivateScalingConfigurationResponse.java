// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeactivateScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateScalingConfigurationResponseBody body;

    public static DeactivateScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateScalingConfigurationResponse self = new DeactivateScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateScalingConfigurationResponse setBody(DeactivateScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
