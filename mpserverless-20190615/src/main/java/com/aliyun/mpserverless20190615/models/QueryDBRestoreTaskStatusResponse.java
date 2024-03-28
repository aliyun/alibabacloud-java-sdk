// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBRestoreTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDBRestoreTaskStatusResponseBody body;

    public static QueryDBRestoreTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDBRestoreTaskStatusResponse self = new QueryDBRestoreTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDBRestoreTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDBRestoreTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDBRestoreTaskStatusResponse setBody(QueryDBRestoreTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBRestoreTaskStatusResponseBody getBody() {
        return this.body;
    }

}
