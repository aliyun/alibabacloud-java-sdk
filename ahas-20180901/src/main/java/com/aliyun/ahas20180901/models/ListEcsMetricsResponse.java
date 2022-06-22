// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListEcsMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEcsMetricsResponseBody body;

    public static ListEcsMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcsMetricsResponse self = new ListEcsMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListEcsMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEcsMetricsResponse setBody(ListEcsMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsMetricsResponseBody getBody() {
        return this.body;
    }

}
