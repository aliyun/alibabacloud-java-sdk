// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TerminateSqlStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateSqlStatementResponseBody body;

    public static TerminateSqlStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateSqlStatementResponse self = new TerminateSqlStatementResponse();
        return TeaModel.build(map, self);
    }

    public TerminateSqlStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateSqlStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateSqlStatementResponse setBody(TerminateSqlStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateSqlStatementResponseBody getBody() {
        return this.body;
    }

}
