// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMcdpZoneResponseBody body;

    public static QueryMcdpZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpZoneResponse self = new QueryMcdpZoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcdpZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcdpZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcdpZoneResponse setBody(QueryMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
