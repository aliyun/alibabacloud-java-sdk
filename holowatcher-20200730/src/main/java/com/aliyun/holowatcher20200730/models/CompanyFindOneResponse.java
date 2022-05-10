// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyFindOneResponseBody body;

    public static CompanyFindOneResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindOneResponse self = new CompanyFindOneResponse();
        return TeaModel.build(map, self);
    }

    public CompanyFindOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyFindOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompanyFindOneResponse setBody(CompanyFindOneResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyFindOneResponseBody getBody() {
        return this.body;
    }

}
