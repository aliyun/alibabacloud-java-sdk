// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBExportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDBExportTaskStatusResponse setBody(QueryDBExportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBExportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
