// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowEditLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowEditLockResponseBody body;

    public static DeleteFlowEditLockResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowEditLockResponse self = new DeleteFlowEditLockResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowEditLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowEditLockResponse setBody(DeleteFlowEditLockResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowEditLockResponseBody getBody() {
        return this.body;
    }

}
