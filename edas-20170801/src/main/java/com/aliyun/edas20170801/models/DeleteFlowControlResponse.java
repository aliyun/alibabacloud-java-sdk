// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowControlResponseBody body;

    public static DeleteFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowControlResponse self = new DeleteFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowControlResponse setBody(DeleteFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowControlResponseBody getBody() {
        return this.body;
    }

}
