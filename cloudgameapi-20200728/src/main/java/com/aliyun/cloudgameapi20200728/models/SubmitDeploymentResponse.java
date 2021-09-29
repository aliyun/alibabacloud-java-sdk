// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDeploymentResponseBody body;

    public static SubmitDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeploymentResponse self = new SubmitDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDeploymentResponse setBody(SubmitDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDeploymentResponseBody getBody() {
        return this.body;
    }

}
