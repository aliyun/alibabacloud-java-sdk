// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignLastRangeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignLastRangeNewResponseBody body;

    public static QuerySmsSignLastRangeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignLastRangeNewResponse self = new QuerySmsSignLastRangeNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignLastRangeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignLastRangeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignLastRangeNewResponse setBody(QuerySmsSignLastRangeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignLastRangeNewResponseBody getBody() {
        return this.body;
    }

}
