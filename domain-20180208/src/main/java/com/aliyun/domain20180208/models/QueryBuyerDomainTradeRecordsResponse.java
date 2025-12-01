// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBuyerDomainTradeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBuyerDomainTradeRecordsResponseBody body;

    public static QueryBuyerDomainTradeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyerDomainTradeRecordsResponse self = new QueryBuyerDomainTradeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuyerDomainTradeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBuyerDomainTradeRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBuyerDomainTradeRecordsResponse setBody(QueryBuyerDomainTradeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBuyerDomainTradeRecordsResponseBody getBody() {
        return this.body;
    }

}
