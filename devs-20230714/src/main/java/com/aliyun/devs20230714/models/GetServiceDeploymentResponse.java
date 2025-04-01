// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetServiceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServiceDeployment body;

    public static GetServiceDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDeploymentResponse self = new GetServiceDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceDeploymentResponse setBody(ServiceDeployment body) {
        this.body = body;
        return this;
    }
    public ServiceDeployment getBody() {
        return this.body;
    }

}
