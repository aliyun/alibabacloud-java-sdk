// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRunMetricsResponseBody body;

    public static ListRunMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRunMetricsResponse self = new ListRunMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListRunMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRunMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRunMetricsResponse setBody(ListRunMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRunMetricsResponseBody getBody() {
        return this.body;
    }

}
