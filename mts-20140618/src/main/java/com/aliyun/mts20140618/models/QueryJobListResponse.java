// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJobListResponseBody body;

    public static QueryJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobListResponse self = new QueryJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobListResponse setBody(QueryJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobListResponseBody getBody() {
        return this.body;
    }

}
