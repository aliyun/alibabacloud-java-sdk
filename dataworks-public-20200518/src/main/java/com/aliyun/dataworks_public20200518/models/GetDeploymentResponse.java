// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeploymentResponseBody body;

    public static GetDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponse self = new GetDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentResponse setBody(GetDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentResponseBody getBody() {
        return this.body;
    }

}
