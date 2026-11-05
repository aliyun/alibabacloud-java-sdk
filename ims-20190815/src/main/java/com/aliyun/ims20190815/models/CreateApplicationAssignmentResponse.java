// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationAssignmentResponseBody body;

    public static CreateApplicationAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAssignmentResponse self = new CreateApplicationAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationAssignmentResponse setBody(CreateApplicationAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationAssignmentResponseBody getBody() {
        return this.body;
    }

}
