// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJobResponseBody body;

    public static QueryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobResponse self = new QueryJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobResponse setBody(QueryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobResponseBody getBody() {
        return this.body;
    }

}
