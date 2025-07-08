// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignListNewResponseBody body;

    public static QuerySmsSignListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListNewResponse self = new QuerySmsSignListNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignListNewResponse setBody(QuerySmsSignListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignListNewResponseBody getBody() {
        return this.body;
    }

}
