// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutCustomMetricResponseBody body;

    public static PutCustomMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricResponse self = new PutCustomMetricResponse();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCustomMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutCustomMetricResponse setBody(PutCustomMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomMetricResponseBody getBody() {
        return this.body;
    }

}
