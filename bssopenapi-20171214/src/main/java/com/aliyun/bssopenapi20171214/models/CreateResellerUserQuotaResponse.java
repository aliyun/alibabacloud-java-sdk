// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResellerUserQuotaResponseBody body;

    public static CreateResellerUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResellerUserQuotaResponse self = new CreateResellerUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CreateResellerUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResellerUserQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResellerUserQuotaResponse setBody(CreateResellerUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResellerUserQuotaResponseBody getBody() {
        return this.body;
    }

}
