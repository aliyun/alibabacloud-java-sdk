// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteAccessAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessAssignmentResponse setBody(DeleteAccessAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessAssignmentResponseBody getBody() {
        return this.body;
    }

}
