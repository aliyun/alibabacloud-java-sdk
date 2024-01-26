// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallManagedPrometheusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallManagedPrometheusResponseBody body;

    public static UninstallManagedPrometheusResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallManagedPrometheusResponse self = new UninstallManagedPrometheusResponse();
        return TeaModel.build(map, self);
    }

    public UninstallManagedPrometheusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallManagedPrometheusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallManagedPrometheusResponse setBody(UninstallManagedPrometheusResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallManagedPrometheusResponseBody getBody() {
        return this.body;
    }

}
