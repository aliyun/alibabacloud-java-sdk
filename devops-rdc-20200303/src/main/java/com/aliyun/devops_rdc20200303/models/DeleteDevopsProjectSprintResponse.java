// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectSprintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsProjectSprintResponseBody body;

    public static DeleteDevopsProjectSprintResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectSprintResponse self = new DeleteDevopsProjectSprintResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectSprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsProjectSprintResponse setBody(DeleteDevopsProjectSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsProjectSprintResponseBody getBody() {
        return this.body;
    }

}
