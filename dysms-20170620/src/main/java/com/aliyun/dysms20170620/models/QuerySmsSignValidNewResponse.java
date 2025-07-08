// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignValidNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignValidNewResponseBody body;

    public static QuerySmsSignValidNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignValidNewResponse self = new QuerySmsSignValidNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignValidNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignValidNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignValidNewResponse setBody(QuerySmsSignValidNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignValidNewResponseBody getBody() {
        return this.body;
    }

}
