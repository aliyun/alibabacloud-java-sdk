// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class EnableMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableMetricResponseBody body;

    public static EnableMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricResponse self = new EnableMetricResponse();
        return TeaModel.build(map, self);
    }

    public EnableMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMetricResponse setBody(EnableMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMetricResponseBody getBody() {
        return this.body;
    }

}
