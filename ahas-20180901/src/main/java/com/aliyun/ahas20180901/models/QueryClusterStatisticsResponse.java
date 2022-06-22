// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryClusterStatisticsResponseBody body;

    public static QueryClusterStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterStatisticsResponse self = new QueryClusterStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterStatisticsResponse setBody(QueryClusterStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterStatisticsResponseBody getBody() {
        return this.body;
    }

}
