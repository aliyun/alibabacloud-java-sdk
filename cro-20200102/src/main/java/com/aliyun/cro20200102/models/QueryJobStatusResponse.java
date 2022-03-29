// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class QueryJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJobStatusResponseBody body;

    public static QueryJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatusResponse self = new QueryJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobStatusResponse setBody(QueryJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobStatusResponseBody getBody() {
        return this.body;
    }

}
