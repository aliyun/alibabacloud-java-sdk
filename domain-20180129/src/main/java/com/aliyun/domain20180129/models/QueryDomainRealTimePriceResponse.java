// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealTimePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainRealTimePriceResponseBody body;

    public static QueryDomainRealTimePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealTimePriceResponse self = new QueryDomainRealTimePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealTimePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainRealTimePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainRealTimePriceResponse setBody(QueryDomainRealTimePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainRealTimePriceResponseBody getBody() {
        return this.body;
    }

}
