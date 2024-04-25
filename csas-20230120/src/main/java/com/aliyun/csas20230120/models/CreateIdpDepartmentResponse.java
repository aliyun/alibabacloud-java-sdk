// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateIdpDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdpDepartmentResponseBody body;

    public static CreateIdpDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdpDepartmentResponse self = new CreateIdpDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdpDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdpDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdpDepartmentResponse setBody(CreateIdpDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdpDepartmentResponseBody getBody() {
        return this.body;
    }

}
