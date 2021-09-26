// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowProjectResponseBody body;

    public static DeleteFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectResponse self = new DeleteFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowProjectResponse setBody(DeleteFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowProjectResponseBody getBody() {
        return this.body;
    }

}
