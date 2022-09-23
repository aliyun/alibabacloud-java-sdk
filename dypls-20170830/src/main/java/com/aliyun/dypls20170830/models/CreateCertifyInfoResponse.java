// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateCertifyInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertifyInfoResponseBody body;

    public static CreateCertifyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertifyInfoResponse self = new CreateCertifyInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertifyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertifyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCertifyInfoResponse setBody(CreateCertifyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertifyInfoResponseBody getBody() {
        return this.body;
    }

}
