// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateUserDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserDepartmentsResponseBody body;

    public static CreateUserDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDepartmentsResponse self = new CreateUserDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserDepartmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserDepartmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserDepartmentsResponse setBody(CreateUserDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserDepartmentsResponseBody getBody() {
        return this.body;
    }

}
