// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddCasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasesResponseBody body;

    public static AddCasesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasesResponse self = new AddCasesResponse();
        return TeaModel.build(map, self);
    }

    public AddCasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCasesResponse setBody(AddCasesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasesResponseBody getBody() {
        return this.body;
    }

}
