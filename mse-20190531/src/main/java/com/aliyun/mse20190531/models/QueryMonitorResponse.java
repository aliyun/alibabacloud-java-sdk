// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonitorResponseBody body;

    public static QueryMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorResponse self = new QueryMonitorResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonitorResponse setBody(QueryMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonitorResponseBody getBody() {
        return this.body;
    }

}
