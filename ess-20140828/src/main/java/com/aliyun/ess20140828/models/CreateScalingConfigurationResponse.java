// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateScalingConfigurationResponse setBody(CreateScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
