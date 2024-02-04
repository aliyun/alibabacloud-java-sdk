// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSQLAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSQLAccountResponseBody body;

    public static CreateSQLAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLAccountResponse self = new CreateSQLAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateSQLAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSQLAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSQLAccountResponse setBody(CreateSQLAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSQLAccountResponseBody getBody() {
        return this.body;
    }

}
