// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateEciScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEciScalingConfigurationResponseBody body;

    public static CreateEciScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEciScalingConfigurationResponse self = new CreateEciScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateEciScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEciScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEciScalingConfigurationResponse setBody(CreateEciScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEciScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
