// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendFailDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySendFailDetailsResponseBody body;

    public static QuerySendFailDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendFailDetailsResponse self = new QuerySendFailDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendFailDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendFailDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySendFailDetailsResponse setBody(QuerySendFailDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendFailDetailsResponseBody getBody() {
        return this.body;
    }

}
