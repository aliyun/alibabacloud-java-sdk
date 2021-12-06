// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessAssignmentResponseBody body;

    public static DeleteAccessAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessAssignmentResponse self = new DeleteAccessAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessAssignmentResponse setBody(DeleteAccessAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessAssignmentResponseBody getBody() {
        return this.body;
    }

}
