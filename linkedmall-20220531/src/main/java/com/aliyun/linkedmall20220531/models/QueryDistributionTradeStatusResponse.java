// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionTradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDistributionTradeStatusResponseBody body;

    public static QueryDistributionTradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionTradeStatusResponse self = new QueryDistributionTradeStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionTradeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributionTradeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributionTradeStatusResponse setBody(QueryDistributionTradeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributionTradeStatusResponseBody getBody() {
        return this.body;
    }

}
