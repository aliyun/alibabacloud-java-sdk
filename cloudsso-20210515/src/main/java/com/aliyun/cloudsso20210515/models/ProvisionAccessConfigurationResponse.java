// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ProvisionAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProvisionAccessConfigurationResponseBody body;

    public static ProvisionAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ProvisionAccessConfigurationResponse self = new ProvisionAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ProvisionAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProvisionAccessConfigurationResponse setBody(ProvisionAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ProvisionAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
