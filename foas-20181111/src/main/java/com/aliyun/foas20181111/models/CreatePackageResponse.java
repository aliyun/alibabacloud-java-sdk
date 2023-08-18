// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreatePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePackageResponseBody body;

    public static CreatePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageResponse self = new CreatePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreatePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePackageResponse setBody(CreatePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePackageResponseBody getBody() {
        return this.body;
    }

}
