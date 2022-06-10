// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnfinishedSessionsResponseBody body;

    public static QueryUnfinishedSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessionsResponse self = new QueryUnfinishedSessionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnfinishedSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUnfinishedSessionsResponse setBody(QueryUnfinishedSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnfinishedSessionsResponseBody getBody() {
        return this.body;
    }

}
