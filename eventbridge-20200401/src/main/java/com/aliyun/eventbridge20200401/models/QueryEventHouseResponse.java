// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventHouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventHouseResponseBody body;

    public static QueryEventHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventHouseResponse self = new QueryEventHouseResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventHouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventHouseResponse setBody(QueryEventHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventHouseResponseBody getBody() {
        return this.body;
    }

}
