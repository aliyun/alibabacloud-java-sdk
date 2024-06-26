// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryConsortiumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConsortiumDeletableResponseBody body;

    public static QueryConsortiumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsortiumDeletableResponse self = new QueryConsortiumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsortiumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConsortiumDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConsortiumDeletableResponse setBody(QueryConsortiumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsortiumDeletableResponseBody getBody() {
        return this.body;
    }

}
