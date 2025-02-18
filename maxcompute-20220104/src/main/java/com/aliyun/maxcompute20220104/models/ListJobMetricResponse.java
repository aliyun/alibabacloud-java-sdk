// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobMetricResponseBody body;

    public static ListJobMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobMetricResponse self = new ListJobMetricResponse();
        return TeaModel.build(map, self);
    }

    public ListJobMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobMetricResponse setBody(ListJobMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobMetricResponseBody getBody() {
        return this.body;
    }

}
