// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentJobStatusResponseBody body;

    public static UpdateDeploymentJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobStatusResponse self = new UpdateDeploymentJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentJobStatusResponse setBody(UpdateDeploymentJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentJobStatusResponseBody getBody() {
        return this.body;
    }

}
