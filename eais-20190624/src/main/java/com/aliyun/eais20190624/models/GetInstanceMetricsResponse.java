// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceMetricsResponseBody body;

    public static GetInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricsResponse self = new GetInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceMetricsResponse setBody(GetInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
