// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyAndMainUserCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyAndMainUserCreateResponseBody body;

    public static CompanyAndMainUserCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyAndMainUserCreateResponse self = new CompanyAndMainUserCreateResponse();
        return TeaModel.build(map, self);
    }

    public CompanyAndMainUserCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyAndMainUserCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompanyAndMainUserCreateResponse setBody(CompanyAndMainUserCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyAndMainUserCreateResponseBody getBody() {
        return this.body;
    }

}
