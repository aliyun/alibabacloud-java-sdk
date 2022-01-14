// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApirestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMgsApirestResponseBody body;

    public static QueryMgsApirestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApirestResponse self = new QueryMgsApirestResponse();
        return TeaModel.build(map, self);
    }

    public QueryMgsApirestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMgsApirestResponse setBody(QueryMgsApirestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMgsApirestResponseBody getBody() {
        return this.body;
    }

}
