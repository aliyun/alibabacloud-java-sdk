// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelMacMetricsOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelMacMetricsOfResourceResponseBody body;

    public static QuerySentinelMacMetricsOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelMacMetricsOfResourceResponse self = new QuerySentinelMacMetricsOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelMacMetricsOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelMacMetricsOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelMacMetricsOfResourceResponse setBody(QuerySentinelMacMetricsOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelMacMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

}
