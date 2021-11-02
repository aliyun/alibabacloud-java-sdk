// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryStatementsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStatementsResponseBody body;

    public static QueryStatementsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatementsResponse self = new QueryStatementsResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatementsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatementsResponse setBody(QueryStatementsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatementsResponseBody getBody() {
        return this.body;
    }

}
