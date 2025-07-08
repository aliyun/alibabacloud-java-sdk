// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendFailDetailsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySendFailDetailsNewResponseBody body;

    public static QuerySendFailDetailsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendFailDetailsNewResponse self = new QuerySendFailDetailsNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendFailDetailsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendFailDetailsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySendFailDetailsNewResponse setBody(QuerySendFailDetailsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendFailDetailsNewResponseBody getBody() {
        return this.body;
    }

}
