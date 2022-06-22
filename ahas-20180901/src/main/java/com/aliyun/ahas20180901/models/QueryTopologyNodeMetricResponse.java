// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyNodeMetricResponseBody body;

    public static QueryTopologyNodeMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeMetricResponse self = new QueryTopologyNodeMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyNodeMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyNodeMetricResponse setBody(QueryTopologyNodeMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyNodeMetricResponseBody getBody() {
        return this.body;
    }

}
