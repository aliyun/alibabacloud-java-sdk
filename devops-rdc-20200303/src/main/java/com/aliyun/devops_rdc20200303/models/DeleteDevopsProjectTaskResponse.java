// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsProjectTaskResponseBody body;

    public static DeleteDevopsProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectTaskResponse self = new DeleteDevopsProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsProjectTaskResponse setBody(DeleteDevopsProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsProjectTaskResponseBody getBody() {
        return this.body;
    }

}
