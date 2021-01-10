// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBRestoreTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDBRestoreTaskStatusResponse setBody(QueryDBRestoreTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBRestoreTaskStatusResponseBody getBody() {
        return this.body;
    }

}
