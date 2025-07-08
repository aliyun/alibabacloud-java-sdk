// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignDetailBySignIdNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignDetailBySignIdNewResponseBody body;

    public static QuerySmsSignDetailBySignIdNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignDetailBySignIdNewResponse self = new QuerySmsSignDetailBySignIdNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignDetailBySignIdNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignDetailBySignIdNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignDetailBySignIdNewResponse setBody(QuerySmsSignDetailBySignIdNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignDetailBySignIdNewResponseBody getBody() {
        return this.body;
    }

}
