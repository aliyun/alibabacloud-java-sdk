// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusRemoteWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrometheusRemoteWriteResponseBody body;

    public static AddPrometheusRemoteWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusRemoteWriteResponse self = new AddPrometheusRemoteWriteResponse();
        return TeaModel.build(map, self);
    }

    public AddPrometheusRemoteWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrometheusRemoteWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrometheusRemoteWriteResponse setBody(AddPrometheusRemoteWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

}
