// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeployGroupResponseBody body;

    public static DeleteDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployGroupResponse self = new DeleteDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeployGroupResponse setBody(DeleteDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeployGroupResponseBody getBody() {
        return this.body;
    }

}
