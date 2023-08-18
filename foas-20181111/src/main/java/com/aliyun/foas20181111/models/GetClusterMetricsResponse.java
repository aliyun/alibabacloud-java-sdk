// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterMetricsResponseBody body;

    public static GetClusterMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterMetricsResponse self = new GetClusterMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterMetricsResponse setBody(GetClusterMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterMetricsResponseBody getBody() {
        return this.body;
    }

}
