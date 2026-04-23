// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostTrendMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryCostTrendMetricsResponseBody body;

    public static ModelRouterQueryCostTrendMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostTrendMetricsResponse self = new ModelRouterQueryCostTrendMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostTrendMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryCostTrendMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryCostTrendMetricsResponse setBody(ModelRouterQueryCostTrendMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryCostTrendMetricsResponseBody getBody() {
        return this.body;
    }

}
