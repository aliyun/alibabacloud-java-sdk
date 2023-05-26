// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrometheusInstanceResponseBody body;

    public static GetPrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusInstanceResponse self = new GetPrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusInstanceResponse setBody(GetPrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
