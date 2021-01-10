// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBImportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDBImportTaskStatusResponse setBody(QueryDBImportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBImportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
