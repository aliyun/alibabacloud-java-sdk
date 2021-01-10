// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMCJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMCJobListResponseBody body;

    public static QueryMCJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMCJobListResponse self = new QueryMCJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMCJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMCJobListResponse setBody(QueryMCJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMCJobListResponseBody getBody() {
        return this.body;
    }

}
