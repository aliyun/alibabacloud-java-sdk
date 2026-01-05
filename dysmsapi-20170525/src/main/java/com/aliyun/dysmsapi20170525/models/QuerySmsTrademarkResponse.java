// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsTrademarkResponseBody body;

    public static QuerySmsTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTrademarkResponse self = new QuerySmsTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsTrademarkResponse setBody(QuerySmsTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsTrademarkResponseBody getBody() {
        return this.body;
    }

}
