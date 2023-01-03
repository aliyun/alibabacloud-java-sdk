// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrometheusRemoteWritesResponseBody body;

    public static ListPrometheusRemoteWritesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusRemoteWritesResponse self = new ListPrometheusRemoteWritesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusRemoteWritesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusRemoteWritesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusRemoteWritesResponse setBody(ListPrometheusRemoteWritesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusRemoteWritesResponseBody getBody() {
        return this.body;
    }

}
