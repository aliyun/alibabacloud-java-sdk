// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAppDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppDeploymentResponseBody body;

    public static GetAppDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppDeploymentResponse self = new GetAppDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetAppDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppDeploymentResponse setBody(GetAppDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppDeploymentResponseBody getBody() {
        return this.body;
    }

}
