// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrometheusRemoteWriteResponseBody body;

    public static GetPrometheusRemoteWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteWriteResponse self = new GetPrometheusRemoteWriteResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusRemoteWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusRemoteWriteResponse setBody(GetPrometheusRemoteWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

}
