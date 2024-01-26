// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusInstancesResponseBody body;

    public static ListPrometheusInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesResponse self = new ListPrometheusInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusInstancesResponse setBody(ListPrometheusInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusInstancesResponseBody getBody() {
        return this.body;
    }

}
