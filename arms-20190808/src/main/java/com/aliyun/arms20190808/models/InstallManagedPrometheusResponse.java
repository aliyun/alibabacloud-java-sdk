// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallManagedPrometheusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallManagedPrometheusResponseBody body;

    public static InstallManagedPrometheusResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallManagedPrometheusResponse self = new InstallManagedPrometheusResponse();
        return TeaModel.build(map, self);
    }

    public InstallManagedPrometheusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallManagedPrometheusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallManagedPrometheusResponse setBody(InstallManagedPrometheusResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallManagedPrometheusResponseBody getBody() {
        return this.body;
    }

}
