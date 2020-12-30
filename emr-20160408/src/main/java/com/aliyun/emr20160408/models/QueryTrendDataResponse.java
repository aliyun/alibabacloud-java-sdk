// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryTrendDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrendDataResponseBody body;

    public static QueryTrendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrendDataResponse self = new QueryTrendDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrendDataResponse setBody(QueryTrendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrendDataResponseBody getBody() {
        return this.body;
    }

}
