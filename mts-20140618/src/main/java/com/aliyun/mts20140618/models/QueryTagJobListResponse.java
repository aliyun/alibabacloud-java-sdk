// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTagJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTagJobListResponseBody body;

    public static QueryTagJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagJobListResponse self = new QueryTagJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagJobListResponse setBody(QueryTagJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagJobListResponseBody getBody() {
        return this.body;
    }

}
