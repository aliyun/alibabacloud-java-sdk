// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMediaWorkflowResponseBody body;

    public static DeleteMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaWorkflowResponse self = new DeleteMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaWorkflowResponse setBody(DeleteMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
