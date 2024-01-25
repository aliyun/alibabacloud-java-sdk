// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductVersionPackageResponseBody body;

    public static CreateProductVersionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionPackageResponse self = new CreateProductVersionPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductVersionPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductVersionPackageResponse setBody(CreateProductVersionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductVersionPackageResponseBody getBody() {
        return this.body;
    }

}
