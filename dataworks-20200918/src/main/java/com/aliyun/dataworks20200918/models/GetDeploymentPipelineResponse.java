// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDeploymentPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentPipelineResponseBody body;

    public static GetDeploymentPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentPipelineResponse self = new GetDeploymentPipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentPipelineResponse setBody(GetDeploymentPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentPipelineResponseBody getBody() {
        return this.body;
    }

}
