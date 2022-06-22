// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppStatisticsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppStatisticsInfoResponseBody body;

    public static QueryAppStatisticsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppStatisticsInfoResponse self = new QueryAppStatisticsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppStatisticsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppStatisticsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppStatisticsInfoResponse setBody(QueryAppStatisticsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppStatisticsInfoResponseBody getBody() {
        return this.body;
    }

}
