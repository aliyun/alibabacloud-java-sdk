// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsBaseScreenNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsBaseScreenNewResponseBody body;

    public static QuerySmsBaseScreenNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsBaseScreenNewResponse self = new QuerySmsBaseScreenNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsBaseScreenNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsBaseScreenNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsBaseScreenNewResponse setBody(QuerySmsBaseScreenNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsBaseScreenNewResponseBody getBody() {
        return this.body;
    }

}
