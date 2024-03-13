// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeploymentJobResponseBody body;

    public static CreateDeploymentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentJobResponse self = new CreateDeploymentJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeploymentJobResponse setBody(CreateDeploymentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentJobResponseBody getBody() {
        return this.body;
    }

}
