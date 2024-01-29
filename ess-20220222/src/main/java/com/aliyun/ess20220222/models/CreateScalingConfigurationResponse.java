// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScalingConfigurationResponseBody body;

    public static CreateScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingConfigurationResponse self = new CreateScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScalingConfigurationResponse setBody(CreateScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
