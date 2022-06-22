// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryOptionalArgumentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOptionalArgumentsResponseBody body;

    public static QueryOptionalArgumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOptionalArgumentsResponse self = new QueryOptionalArgumentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryOptionalArgumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOptionalArgumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOptionalArgumentsResponse setBody(QueryOptionalArgumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOptionalArgumentsResponseBody getBody() {
        return this.body;
    }

}
