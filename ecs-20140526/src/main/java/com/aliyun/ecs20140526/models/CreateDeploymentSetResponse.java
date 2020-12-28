// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeploymentSetResponseBody body;

    public static CreateDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetResponse self = new CreateDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentSetResponse setBody(CreateDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
