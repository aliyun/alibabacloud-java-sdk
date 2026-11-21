// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnsureSharedPrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnsureSharedPrometheusInstanceResponseBody body;

    public static EnsureSharedPrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnsureSharedPrometheusInstanceResponse self = new EnsureSharedPrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EnsureSharedPrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnsureSharedPrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnsureSharedPrometheusInstanceResponse setBody(EnsureSharedPrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnsureSharedPrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
