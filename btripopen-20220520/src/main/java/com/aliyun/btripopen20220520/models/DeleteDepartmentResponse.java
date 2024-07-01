// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDepartmentResponseBody body;

    public static DeleteDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentResponse self = new DeleteDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDepartmentResponse setBody(DeleteDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDepartmentResponseBody getBody() {
        return this.body;
    }

}
