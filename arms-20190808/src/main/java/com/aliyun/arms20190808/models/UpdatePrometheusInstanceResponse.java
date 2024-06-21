// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusInstanceResponseBody body;

    public static UpdatePrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusInstanceResponse self = new UpdatePrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusInstanceResponse setBody(UpdatePrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
