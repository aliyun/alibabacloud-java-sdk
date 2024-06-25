// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignResponseBody body;

    public static QuerySmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignResponse self = new QuerySmsSignResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignResponse setBody(QuerySmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignResponseBody getBody() {
        return this.body;
    }

}
