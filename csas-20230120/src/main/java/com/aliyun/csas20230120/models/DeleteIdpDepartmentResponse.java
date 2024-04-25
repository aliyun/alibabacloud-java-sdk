// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteIdpDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIdpDepartmentResponseBody body;

    public static DeleteIdpDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdpDepartmentResponse self = new DeleteIdpDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIdpDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIdpDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIdpDepartmentResponse setBody(DeleteIdpDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIdpDepartmentResponseBody getBody() {
        return this.body;
    }

}
