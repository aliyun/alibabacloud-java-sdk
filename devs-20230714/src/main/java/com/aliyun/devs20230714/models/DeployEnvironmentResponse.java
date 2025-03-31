// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnvironmentDeployment body;

    public static DeployEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentResponse self = new DeployEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployEnvironmentResponse setBody(EnvironmentDeployment body) {
        this.body = body;
        return this;
    }
    public EnvironmentDeployment getBody() {
        return this.body;
    }

}
