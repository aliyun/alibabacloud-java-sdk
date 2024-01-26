// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrometheusInstanceResponseBody body;

    public static AddPrometheusInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusInstanceResponse self = new AddPrometheusInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddPrometheusInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrometheusInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrometheusInstanceResponse setBody(AddPrometheusInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrometheusInstanceResponseBody getBody() {
        return this.body;
    }

}
