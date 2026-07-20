// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCompanyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCompanyResponseBody body;

    public static UpdateCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompanyResponse self = new UpdateCompanyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCompanyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCompanyResponse setBody(UpdateCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCompanyResponseBody getBody() {
        return this.body;
    }

}
