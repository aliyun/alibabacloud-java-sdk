// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSqlExecutionHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticSqlExecutionHistoriesResponseBody body;

    public static ListAgenticSqlExecutionHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSqlExecutionHistoriesResponse self = new ListAgenticSqlExecutionHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticSqlExecutionHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticSqlExecutionHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticSqlExecutionHistoriesResponse setBody(ListAgenticSqlExecutionHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticSqlExecutionHistoriesResponseBody getBody() {
        return this.body;
    }

}
