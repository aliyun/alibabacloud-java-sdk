// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListEipMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEipMetricsResponseBody body;

    public static ListEipMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEipMetricsResponse self = new ListEipMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListEipMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEipMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEipMetricsResponse setBody(ListEipMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEipMetricsResponseBody getBody() {
        return this.body;
    }

}
