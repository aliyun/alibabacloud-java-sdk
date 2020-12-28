// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeployConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployConfigurationResponseBody body;

    public static DeployConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployConfigurationResponse self = new DeployConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeployConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployConfigurationResponse setBody(DeployConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployConfigurationResponseBody getBody() {
        return this.body;
    }

}
