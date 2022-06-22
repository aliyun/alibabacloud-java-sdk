// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryFlowStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFlowStatisticsResponseBody body;

    public static QueryFlowStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowStatisticsResponse self = new QueryFlowStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFlowStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFlowStatisticsResponse setBody(QueryFlowStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFlowStatisticsResponseBody getBody() {
        return this.body;
    }

}
