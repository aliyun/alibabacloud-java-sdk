// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryObservationMetricsResponseBody body;

    public static ModelRouterQueryObservationMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationMetricsResponse self = new ModelRouterQueryObservationMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryObservationMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryObservationMetricsResponse setBody(ModelRouterQueryObservationMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryObservationMetricsResponseBody getBody() {
        return this.body;
    }

}
