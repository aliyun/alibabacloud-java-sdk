// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusRemoteWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusRemoteWriteResponseBody body;

    public static UpdatePrometheusRemoteWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusRemoteWriteResponse self = new UpdatePrometheusRemoteWriteResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusRemoteWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusRemoteWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusRemoteWriteResponse setBody(UpdatePrometheusRemoteWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

}
