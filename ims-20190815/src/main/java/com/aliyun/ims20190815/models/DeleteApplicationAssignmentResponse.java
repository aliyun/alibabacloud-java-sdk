// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationAssignmentResponseBody body;

    public static DeleteApplicationAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAssignmentResponse self = new DeleteApplicationAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationAssignmentResponse setBody(DeleteApplicationAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationAssignmentResponseBody getBody() {
        return this.body;
    }

}
