// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDepartmentResponseBody body;

    public static CreateDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentResponse self = new CreateDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDepartmentResponse setBody(CreateDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDepartmentResponseBody getBody() {
        return this.body;
    }

}
