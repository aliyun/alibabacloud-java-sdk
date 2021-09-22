// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeploymentResponseBody body;

    public static UpdateDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentResponse self = new UpdateDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentResponse setBody(UpdateDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentResponseBody getBody() {
        return this.body;
    }

}
