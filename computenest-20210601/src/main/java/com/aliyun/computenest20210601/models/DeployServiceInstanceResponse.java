// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeployServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployServiceInstanceResponseBody body;

    public static DeployServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployServiceInstanceResponse self = new DeployServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeployServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployServiceInstanceResponse setBody(DeployServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
