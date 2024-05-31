// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSqlStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlStatementResponseBody body;

    public static CreateSqlStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlStatementResponse self = new CreateSqlStatementResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlStatementResponse setBody(CreateSqlStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlStatementResponseBody getBody() {
        return this.body;
    }

}
