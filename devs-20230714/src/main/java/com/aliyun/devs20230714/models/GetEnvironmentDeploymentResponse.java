// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnvironmentDeployment body;

    public static GetEnvironmentDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeploymentResponse self = new GetEnvironmentDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnvironmentDeploymentResponse setBody(EnvironmentDeployment body) {
        this.body = body;
        return this;
    }
    public EnvironmentDeployment getBody() {
        return this.body;
    }

}
