// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateSupplierRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSupplierRegistrationResponseBody body;

    public static CreateSupplierRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSupplierRegistrationResponse self = new CreateSupplierRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateSupplierRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSupplierRegistrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSupplierRegistrationResponse setBody(CreateSupplierRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSupplierRegistrationResponseBody getBody() {
        return this.body;
    }

}
