// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelMetricsOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelMetricsOfResourceResponseBody body;

    public static QuerySentinelMetricsOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelMetricsOfResourceResponse self = new QuerySentinelMetricsOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelMetricsOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelMetricsOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelMetricsOfResourceResponse setBody(QuerySentinelMetricsOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

}
