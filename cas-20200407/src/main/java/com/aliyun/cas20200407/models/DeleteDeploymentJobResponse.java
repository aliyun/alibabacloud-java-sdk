// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteDeploymentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeploymentJobResponseBody body;

    public static DeleteDeploymentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentJobResponse self = new DeleteDeploymentJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeploymentJobResponse setBody(DeleteDeploymentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentJobResponseBody getBody() {
        return this.body;
    }

}
