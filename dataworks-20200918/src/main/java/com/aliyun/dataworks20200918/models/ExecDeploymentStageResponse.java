// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ExecDeploymentStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDeploymentStageResponseBody body;

    public static ExecDeploymentStageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDeploymentStageResponse self = new ExecDeploymentStageResponse();
        return TeaModel.build(map, self);
    }

    public ExecDeploymentStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDeploymentStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDeploymentStageResponse setBody(ExecDeploymentStageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDeploymentStageResponseBody getBody() {
        return this.body;
    }

}
