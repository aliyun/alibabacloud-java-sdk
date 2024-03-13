// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPriceEntityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPriceEntityListResponseBody body;

    public static QueryPriceEntityListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceEntityListResponse self = new QueryPriceEntityListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPriceEntityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPriceEntityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPriceEntityListResponse setBody(QueryPriceEntityListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPriceEntityListResponseBody getBody() {
        return this.body;
    }

}
