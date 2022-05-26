// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateRealNameCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRealNameCertificationResponseBody body;

    public static CreateRealNameCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealNameCertificationResponse self = new CreateRealNameCertificationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealNameCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRealNameCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRealNameCertificationResponse setBody(CreateRealNameCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRealNameCertificationResponseBody getBody() {
        return this.body;
    }

}
