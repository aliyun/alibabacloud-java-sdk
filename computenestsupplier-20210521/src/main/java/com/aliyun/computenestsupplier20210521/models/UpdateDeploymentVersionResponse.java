// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeploymentVersionResponseBody body;

    public static UpdateDeploymentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentVersionResponse self = new UpdateDeploymentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentVersionResponse setBody(UpdateDeploymentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentVersionResponseBody getBody() {
        return this.body;
    }

}
