// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBImportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDBImportTaskStatusResponseBody body;

    public static QueryDBImportTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDBImportTaskStatusResponse self = new QueryDBImportTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDBImportTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDBImportTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDBImportTaskStatusResponse setBody(QueryDBImportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBImportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
