// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrometheusInstanceResponseBody body;

    public static CreatePrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceResponse self = new CreatePrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrometheusInstanceResponse setBody(CreatePrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
