// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventTracesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventTracesResponseBody body;

    public static QueryEventTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventTracesResponse self = new QueryEventTracesResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventTracesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventTracesResponse setBody(QueryEventTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventTracesResponseBody getBody() {
        return this.body;
    }

}
