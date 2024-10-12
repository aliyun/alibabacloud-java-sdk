// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LogRunMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogRunMetricsResponseBody body;

    public static LogRunMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        LogRunMetricsResponse self = new LogRunMetricsResponse();
        return TeaModel.build(map, self);
    }

    public LogRunMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogRunMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogRunMetricsResponse setBody(LogRunMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public LogRunMetricsResponseBody getBody() {
        return this.body;
    }

}
