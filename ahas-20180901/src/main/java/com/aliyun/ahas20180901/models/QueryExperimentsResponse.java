// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentsResponseBody body;

    public static QueryExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentsResponse self = new QueryExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentsResponse setBody(QueryExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentsResponseBody getBody() {
        return this.body;
    }

}
