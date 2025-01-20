// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryAttractionsNlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResult body;

    public static QueryAttractionsNlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttractionsNlResponse self = new QueryAttractionsNlResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttractionsNlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttractionsNlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttractionsNlResponse setBody(QueryResult body) {
        this.body = body;
        return this;
    }
    public QueryResult getBody() {
        return this.body;
    }

}
