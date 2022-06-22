// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryActivityTaskMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryActivityTaskMetricResponseBody body;

    public static QueryActivityTaskMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityTaskMetricResponse self = new QueryActivityTaskMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryActivityTaskMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryActivityTaskMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryActivityTaskMetricResponse setBody(QueryActivityTaskMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryActivityTaskMetricResponseBody getBody() {
        return this.body;
    }

}
