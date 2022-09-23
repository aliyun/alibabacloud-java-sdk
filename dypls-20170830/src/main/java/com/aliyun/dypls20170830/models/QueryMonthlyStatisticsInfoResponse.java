// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryMonthlyStatisticsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonthlyStatisticsInfoResponseBody body;

    public static QueryMonthlyStatisticsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyStatisticsInfoResponse self = new QueryMonthlyStatisticsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyStatisticsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyStatisticsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlyStatisticsInfoResponse setBody(QueryMonthlyStatisticsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyStatisticsInfoResponseBody getBody() {
        return this.body;
    }

}
