// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignLastRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignLastRangeResponseBody body;

    public static QuerySmsSignLastRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignLastRangeResponse self = new QuerySmsSignLastRangeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignLastRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignLastRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignLastRangeResponse setBody(QuerySmsSignLastRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignLastRangeResponseBody getBody() {
        return this.body;
    }

}
