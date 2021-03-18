// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeploymentSetResponseBody body;

    public static DeleteDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentSetResponse self = new DeleteDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentSetResponse setBody(DeleteDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
