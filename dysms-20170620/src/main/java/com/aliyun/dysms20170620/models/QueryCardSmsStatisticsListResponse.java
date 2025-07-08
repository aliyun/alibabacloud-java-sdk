// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsStatisticsListResponseBody body;

    public static QueryCardSmsStatisticsListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsListResponse self = new QueryCardSmsStatisticsListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsStatisticsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsStatisticsListResponse setBody(QueryCardSmsStatisticsListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsStatisticsListResponseBody getBody() {
        return this.body;
    }

}
