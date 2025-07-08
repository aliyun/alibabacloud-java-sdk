// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignValidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignValidResponseBody body;

    public static QuerySmsSignValidResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignValidResponse self = new QuerySmsSignValidResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignValidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignValidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignValidResponse setBody(QuerySmsSignValidResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignValidResponseBody getBody() {
        return this.body;
    }

}
