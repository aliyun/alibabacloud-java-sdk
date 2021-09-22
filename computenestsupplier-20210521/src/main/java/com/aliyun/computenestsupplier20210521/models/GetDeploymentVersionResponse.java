// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetDeploymentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeploymentVersionResponseBody body;

    public static GetDeploymentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentVersionResponse self = new GetDeploymentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentVersionResponse setBody(GetDeploymentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentVersionResponseBody getBody() {
        return this.body;
    }

}
