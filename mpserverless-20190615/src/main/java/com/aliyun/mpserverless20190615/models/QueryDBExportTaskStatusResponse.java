// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBExportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDBExportTaskStatusResponseBody body;

    public static QueryDBExportTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDBExportTaskStatusResponse self = new QueryDBExportTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDBExportTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDBExportTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDBExportTaskStatusResponse setBody(QueryDBExportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBExportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
