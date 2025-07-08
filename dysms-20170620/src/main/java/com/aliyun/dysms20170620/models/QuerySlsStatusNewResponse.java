// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySlsStatusNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySlsStatusNewResponseBody body;

    public static QuerySlsStatusNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsStatusNewResponse self = new QuerySlsStatusNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlsStatusNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlsStatusNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlsStatusNewResponse setBody(QuerySlsStatusNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlsStatusNewResponseBody getBody() {
        return this.body;
    }

}
