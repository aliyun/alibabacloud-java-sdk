// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderCommissionRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderCommissionRateResponseBody body;

    public static QueryOrderCommissionRateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderCommissionRateResponse self = new QueryOrderCommissionRateResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderCommissionRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderCommissionRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderCommissionRateResponse setBody(QueryOrderCommissionRateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderCommissionRateResponseBody getBody() {
        return this.body;
    }

}
