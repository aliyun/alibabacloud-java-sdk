// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateUserDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateUserDepartmentsResponse setBody(CreateUserDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserDepartmentsResponseBody getBody() {
        return this.body;
    }

}
