// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDepartmentResponseBody body;

    public static AddDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDepartmentResponse self = new AddDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public AddDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDepartmentResponse setBody(AddDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDepartmentResponseBody getBody() {
        return this.body;
    }

}
