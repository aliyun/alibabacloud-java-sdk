// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusRemoteWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusRemoteWriteResponseBody body;

    public static DeletePrometheusRemoteWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusRemoteWriteResponse self = new DeletePrometheusRemoteWriteResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusRemoteWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusRemoteWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusRemoteWriteResponse setBody(DeletePrometheusRemoteWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

}
