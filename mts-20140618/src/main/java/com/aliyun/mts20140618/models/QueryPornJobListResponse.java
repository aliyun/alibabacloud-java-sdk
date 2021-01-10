// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPornJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPornJobListResponseBody body;

    public static QueryPornJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPornJobListResponse self = new QueryPornJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPornJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPornJobListResponse setBody(QueryPornJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPornJobListResponseBody getBody() {
        return this.body;
    }

}
