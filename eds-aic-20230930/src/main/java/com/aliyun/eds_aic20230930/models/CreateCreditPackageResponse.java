// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCreditPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCreditPackageResponseBody body;

    public static CreateCreditPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditPackageResponse self = new CreateCreditPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateCreditPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCreditPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCreditPackageResponse setBody(CreateCreditPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCreditPackageResponseBody getBody() {
        return this.body;
    }

}
