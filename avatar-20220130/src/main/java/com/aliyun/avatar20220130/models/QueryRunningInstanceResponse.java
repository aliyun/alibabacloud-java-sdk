// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryRunningInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRunningInstanceResponseBody body;

    public static QueryRunningInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRunningInstanceResponse self = new QueryRunningInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRunningInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRunningInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRunningInstanceResponse setBody(QueryRunningInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRunningInstanceResponseBody getBody() {
        return this.body;
    }

}
