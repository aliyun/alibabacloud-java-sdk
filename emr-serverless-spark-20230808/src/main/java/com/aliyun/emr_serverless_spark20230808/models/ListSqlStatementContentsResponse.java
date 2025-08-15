// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSqlStatementContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSqlStatementContentsResponseBody body;

    public static ListSqlStatementContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSqlStatementContentsResponse self = new ListSqlStatementContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListSqlStatementContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSqlStatementContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSqlStatementContentsResponse setBody(ListSqlStatementContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSqlStatementContentsResponseBody getBody() {
        return this.body;
    }

}
