// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyIngressMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyIngressMetricResponseBody body;

    public static QueryTopologyIngressMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyIngressMetricResponse self = new QueryTopologyIngressMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyIngressMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyIngressMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyIngressMetricResponse setBody(QueryTopologyIngressMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyIngressMetricResponseBody getBody() {
        return this.body;
    }

}
