// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentJobResponseBody body;

    public static UpdateDeploymentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobResponse self = new UpdateDeploymentJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentJobResponse setBody(UpdateDeploymentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentJobResponseBody getBody() {
        return this.body;
    }

}
