// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetManagedPrometheusStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedPrometheusStatusResponseBody body;

    public static GetManagedPrometheusStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedPrometheusStatusResponse self = new GetManagedPrometheusStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedPrometheusStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedPrometheusStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedPrometheusStatusResponse setBody(GetManagedPrometheusStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedPrometheusStatusResponseBody getBody() {
        return this.body;
    }

}
