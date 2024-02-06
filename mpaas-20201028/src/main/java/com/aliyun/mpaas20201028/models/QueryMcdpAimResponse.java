// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpAimResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMcdpAimResponseBody body;

    public static QueryMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpAimResponse self = new QueryMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcdpAimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcdpAimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcdpAimResponse setBody(QueryMcdpAimResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcdpAimResponseBody getBody() {
        return this.body;
    }

}
