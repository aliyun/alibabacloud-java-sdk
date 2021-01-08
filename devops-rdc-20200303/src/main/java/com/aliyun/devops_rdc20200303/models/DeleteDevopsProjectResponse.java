// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsProjectResponseBody body;

    public static DeleteDevopsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectResponse self = new DeleteDevopsProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsProjectResponse setBody(DeleteDevopsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsProjectResponseBody getBody() {
        return this.body;
    }

}
