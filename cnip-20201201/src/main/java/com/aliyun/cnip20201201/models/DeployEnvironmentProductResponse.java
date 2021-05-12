// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeployEnvironmentProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployEnvironmentProductResponseBody body;

    public static DeployEnvironmentProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentProductResponse self = new DeployEnvironmentProductResponse();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployEnvironmentProductResponse setBody(DeployEnvironmentProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployEnvironmentProductResponseBody getBody() {
        return this.body;
    }

}
