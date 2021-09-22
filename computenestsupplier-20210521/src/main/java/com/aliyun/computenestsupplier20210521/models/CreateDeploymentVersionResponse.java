// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateDeploymentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeploymentVersionResponseBody body;

    public static CreateDeploymentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentVersionResponse self = new CreateDeploymentVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentVersionResponse setBody(CreateDeploymentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentVersionResponseBody getBody() {
        return this.body;
    }

}
