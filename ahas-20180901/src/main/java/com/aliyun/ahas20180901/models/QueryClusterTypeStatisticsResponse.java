// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterTypeStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryClusterTypeStatisticsResponseBody body;

    public static QueryClusterTypeStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterTypeStatisticsResponse self = new QueryClusterTypeStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterTypeStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterTypeStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterTypeStatisticsResponse setBody(QueryClusterTypeStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterTypeStatisticsResponseBody getBody() {
        return this.body;
    }

}
