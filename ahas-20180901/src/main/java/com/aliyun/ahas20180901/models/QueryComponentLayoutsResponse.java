// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryComponentLayoutsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryComponentLayoutsResponseBody body;

    public static QueryComponentLayoutsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComponentLayoutsResponse self = new QueryComponentLayoutsResponse();
        return TeaModel.build(map, self);
    }

    public QueryComponentLayoutsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryComponentLayoutsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryComponentLayoutsResponse setBody(QueryComponentLayoutsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryComponentLayoutsResponseBody getBody() {
        return this.body;
    }

}
