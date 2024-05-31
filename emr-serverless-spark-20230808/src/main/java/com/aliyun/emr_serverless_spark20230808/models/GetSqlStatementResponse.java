// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSqlStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlStatementResponseBody body;

    public static GetSqlStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlStatementResponse self = new GetSqlStatementResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlStatementResponse setBody(GetSqlStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlStatementResponseBody getBody() {
        return this.body;
    }

}
