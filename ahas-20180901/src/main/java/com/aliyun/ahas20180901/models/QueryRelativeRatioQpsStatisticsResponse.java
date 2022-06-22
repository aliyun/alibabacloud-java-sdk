// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRelativeRatioQpsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRelativeRatioQpsStatisticsResponseBody body;

    public static QueryRelativeRatioQpsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRelativeRatioQpsStatisticsResponse self = new QueryRelativeRatioQpsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRelativeRatioQpsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRelativeRatioQpsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRelativeRatioQpsStatisticsResponse setBody(QueryRelativeRatioQpsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRelativeRatioQpsStatisticsResponseBody getBody() {
        return this.body;
    }

}
