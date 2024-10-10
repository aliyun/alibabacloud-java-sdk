// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDIJobMetricsResponseBody body;

    public static ListDIJobMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobMetricsResponse self = new ListDIJobMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListDIJobMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIJobMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIJobMetricsResponse setBody(ListDIJobMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIJobMetricsResponseBody getBody() {
        return this.body;
    }

}
